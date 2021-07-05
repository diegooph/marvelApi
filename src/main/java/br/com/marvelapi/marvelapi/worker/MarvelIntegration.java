package br.com.marvelapi.marvelapi.worker;

import br.com.marvelapi.marvelapi.dao.*;
import br.com.marvelapi.marvelapi.dto.MarvelDto.*;
import br.com.marvelapi.marvelapi.entity.*;
import br.com.marvelapi.marvelapi.entity.Character;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Essa foi uma integração feita apenas para facilitar a parte de popular o banco...
// algumas informações podem ter sido removidas para não almentar muito a complexidade da atividade
// algumas validações de integração não foram implementadas devido ao tempo, mais vam ser, pois vou continuar desenvolvendo após finalizar o teste
public class MarvelIntegration {
    private final CharacterDao characterDao;
    private final ComicsDao comicsDao;
    private final EventsDao eventsDao;
    private final SeriesDao seriesDao;
    private final StoriesDao storiesDao;

    public MarvelIntegration(CharacterDao characterDao, ComicsDao comicsDao, EventsDao eventsDao, SeriesDao seriesDao, StoriesDao storiesDao) {
        this.characterDao = characterDao;
        this.comicsDao = comicsDao;
        this.eventsDao = eventsDao;
        this.seriesDao = seriesDao;
        this.storiesDao = storiesDao;
    }

    //1009351 -> Hulk    // esse metodo quebraria em outros metodos menores
    public Character pullIntegrationOnline(String characterCustomId) throws IOException {

        String characterJson = findCharacterByCustomId(characterCustomId);
        ReturnCharacterApiMarvel returnCharacterApiMarvel = new Gson().fromJson(characterJson, ReturnCharacterApiMarvel.class);
        List<CharacterApiMarvelDto> characterApiMarvelDto;
        if (returnCharacterApiMarvel.getData() == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nenhum Character encontrado MarvelCode:" + returnCharacterApiMarvel.getCode());

        characterApiMarvelDto = returnCharacterApiMarvel.getData().getResults();

        if (characterApiMarvelDto == null || characterApiMarvelDto.isEmpty())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nenhum Character encontrado MarvelCode:" + returnCharacterApiMarvel.getCode());
        Character character = characterApiMarvelDto.get(0).convertDtoToEntity();


        String comicsJson = findComicByCharacterCustomId(characterCustomId);
        ReturnComicsApiMarvel returnComicsApiMarvel = new Gson().fromJson(comicsJson, ReturnComicsApiMarvel.class);
        List<ComicApiMarvelDto> comicsJsonData = null;
        if (returnComicsApiMarvel.getData() != null)
            comicsJsonData = returnComicsApiMarvel.getData().getResults();

        String eventJson = findEventByCharacterCustomId(characterCustomId);
        ReturnEventsApiMarvel returnEventsApiMarvel = new Gson().fromJson(eventJson, ReturnEventsApiMarvel.class);
        List<EventApiMarvelDto> eventJsonData = null;
        if (returnEventsApiMarvel.getData() != null)
            eventJsonData = returnEventsApiMarvel.getData().getResults();

        String seriesJson = findSeriesByCharacterCustomId(characterCustomId);
        ReturnSeriesApiMarvel returnSeriesApiMarvel = new Gson().fromJson(seriesJson, ReturnSeriesApiMarvel.class);
        List<SeriesApiMarvelDto> seriesJsonData = null;
        if (returnSeriesApiMarvel.getData() != null)
            seriesJsonData = returnSeriesApiMarvel.getData().getResults();

        String storiesJson = findStoriesByCharacterCustomId(characterCustomId);
        ReturnStoriesApiMarvel returnStoriesApiMarvel = new Gson().fromJson(storiesJson, ReturnStoriesApiMarvel.class);
        List<StoryApiMarvelDto> storiesJsonData = null;
        if (returnStoriesApiMarvel.getData() != null)
            storiesJsonData = returnStoriesApiMarvel.getData().getResults();


        if (comicsJsonData != null && !comicsJsonData.isEmpty()) {
            List<Comics> comicsEntityToMarvelDto = comicsJsonData.stream().map(ComicApiMarvelDto::convertToEntity).collect(Collectors.toList());
            List<Comics> customIdsSaved = comicsDao.findByCustomIdIn(comicsEntityToMarvelDto.stream().map(Comics::getCustomId).collect(Collectors.toList()));
            List<Comics> comics = character.getComics();
            if (comics == null){
                comics = new ArrayList<>() ;
            }
            customIdsSaved.removeAll(comics);
            comics.addAll(customIdsSaved);
            List<String> customsIdsToSaved = comics.stream().map(Comics::getCustomId).collect(Collectors.toList());
            comicsEntityToMarvelDto.removeIf(comicEntity -> customsIdsToSaved.contains(comicEntity.getCustomId()));
            comics.addAll(comicsEntityToMarvelDto);
            character.setComics(comics);



        }
        if (seriesJsonData != null && !seriesJsonData.isEmpty()) {
            List<Series> seriesEntityToMarvelDto = seriesJsonData.stream().map(SeriesApiMarvelDto::convertToEntity).collect(Collectors.toList());
            List<Series> customIdsSaved = seriesDao.findByCustomIdIn(seriesEntityToMarvelDto.stream().map(Series::getCustomId).collect(Collectors.toList()));
            List<Series> series = character.getSeries();
            if (series == null){
                series = new ArrayList<>() ;
            }
            customIdsSaved.removeAll(series);
            series.addAll(customIdsSaved);
            List<String> customsIdsToSaved = series.stream().map(Series::getCustomId).collect(Collectors.toList());
            seriesEntityToMarvelDto.removeIf(comicEntity -> customsIdsToSaved.contains(comicEntity.getCustomId()));
            series.addAll(seriesEntityToMarvelDto);
            character.setSeries(series);
        }
        if (eventJsonData != null && !eventJsonData.isEmpty()) {
            List<Events> eventsEntityToMarvelDto = eventJsonData.stream().map(EventApiMarvelDto::convertToEntity).collect(Collectors.toList());
            List<Events> customIdsSaved = eventsDao.findByCustomIdIn(eventsEntityToMarvelDto.stream().map(Events::getCustomId).collect(Collectors.toList()));
            List<Events> events = character.getEvents();
            if (events == null){
                events = new ArrayList<>() ;
            }
            customIdsSaved.removeAll(events);
            events.addAll(customIdsSaved);
            List<String> customsIdsToSaved = events.stream().map(Events::getCustomId).collect(Collectors.toList());
            eventsEntityToMarvelDto.removeIf(comicEntity -> customsIdsToSaved.contains(comicEntity.getCustomId()));
            events.addAll(eventsEntityToMarvelDto);
            character.setEvents(events);
        }
        if (storiesJsonData != null && !storiesJsonData.isEmpty()) {
            List<Stories> storiesEntityToMarvelDto = storiesJsonData.stream().map(StoryApiMarvelDto::convertToEntity).collect(Collectors.toList());
            List<Stories> customIdsSaved = storiesDao.findByCustomIdIn(storiesEntityToMarvelDto.stream().map(Stories::getCustomId).collect(Collectors.toList()));
            List<Stories> stories = character.getStories();
            if (stories == null){
                stories = new ArrayList<>() ;
            }
            customIdsSaved.removeAll(stories);
            stories.addAll(customIdsSaved);
            List<String> customsIdsToSaved = stories.stream().map(Stories::getCustomId).collect(Collectors.toList());
            storiesEntityToMarvelDto.removeIf(comicEntity -> customsIdsToSaved.contains(comicEntity.getCustomId()));
            stories.addAll(storiesEntityToMarvelDto);
            character.setStories(stories);
        }

        this.characterDao.save(character);
        return character;
    }

    public static String findCharacterByCustomId(String customId) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://gateway.marvel.com:443/v1/public/characters/" + customId + "?apikey=cd7a015f5d8c9fc818db2f0204f1184a&hash=b54d536495582c89b19ca8541fcfd5a3&ts=1625451177408")
                .method("GET", null)
                .addHeader("Authorization", "Basic ZGllZ29vcGhAZ21haWwuY29tOjE1Q2FtaWxhMTU=")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String findEventByCharacterCustomId(String customId) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://gateway.marvel.com:443/v1/public/characters/" + customId + "/events" + "?apikey=cd7a015f5d8c9fc818db2f0204f1184a&hash=b54d536495582c89b19ca8541fcfd5a3&ts=1625451177408")
                .method("GET", null)
                .addHeader("Authorization", "Basic ZGllZ29vcGhAZ21haWwuY29tOjE1Q2FtaWxhMTU=")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String findComicByCharacterCustomId(String customId) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://gateway.marvel.com:443/v1/public/characters/" + customId + "/comics" + "?apikey=cd7a015f5d8c9fc818db2f0204f1184a&hash=b54d536495582c89b19ca8541fcfd5a3&ts=1625451177408")
                .method("GET", null)
                .addHeader("Authorization", "Basic ZGllZ29vcGhAZ21haWwuY29tOjE1Q2FtaWxhMTU=")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String findSeriesByCharacterCustomId(String customId) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://gateway.marvel.com:443/v1/public/characters/" + customId + "/series" + "?apikey=cd7a015f5d8c9fc818db2f0204f1184a&hash=b54d536495582c89b19ca8541fcfd5a3&ts=1625451177408")
                .method("GET", null)
                .addHeader("Authorization", "Basic ZGllZ29vcGhAZ21haWwuY29tOjE1Q2FtaWxhMTU=")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String findStoriesByCharacterCustomId(String customId) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://gateway.marvel.com:443/v1/public/characters/" + customId + "/stories" + "?apikey=cd7a015f5d8c9fc818db2f0204f1184a&hash=b54d536495582c89b19ca8541fcfd5a3&ts=1625451177408")
                .method("GET", null)
                .addHeader("Authorization", "Basic ZGllZ29vcGhAZ21haWwuY29tOjE1Q2FtaWxhMTU=")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }

}
