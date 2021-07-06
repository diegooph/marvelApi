package br.com.marvelapi.marvelapi.worker;

import br.com.marvelapi.marvelapi.dao.*;
import br.com.marvelapi.marvelapi.entity.*;
import br.com.marvelapi.marvelapi.entity.Character;

import java.util.List;

public class CharacterWorker {
    private final CharacterDao characterDao;
    private final ComicsDao comicsDao;
    private final EventsDao eventsDao;
    private final SeriesDao seriesDao;
    private final StoriesDao storiesDao;

    public CharacterWorker(CharacterDao characterDao, ComicsDao comicsDao, EventsDao eventsDao, SeriesDao seriesDao, StoriesDao storiesDao) {
        this.characterDao = characterDao;
        this.comicsDao = comicsDao;
        this.eventsDao = eventsDao;
        this.seriesDao = seriesDao;
        this.storiesDao = storiesDao;
    }


    public Character findCharacterById(String characterCustomId){
        return characterDao.findByCustomId(characterCustomId);
    }

    public List<Character> findAll(){
       return characterDao.findAll();
    }

    public List<Comics> findComicsByCharacterId(String characterCustomId) {
       return characterDao.findByCustomId(characterCustomId).getComics();
    }
    public List<Events> findEventsByCharacterId(String characterCustomId) {
        return  characterDao.findByCustomId(characterCustomId).getEvents();
    }

    public List<Series> findSeriesByCharacterId(String characterCustomId) {
        return characterDao.findByCustomId(characterCustomId).getSeries();
    }

    public List<Stories> findStoriesByCharacterId(String characterCustomId) {
        return characterDao.findByCustomId(characterCustomId).getStories();
    }
}
