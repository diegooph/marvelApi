package br.com.marvelapi.marvelapi.controller;

import br.com.marvelapi.marvelapi.dao.*;
import br.com.marvelapi.marvelapi.entity.*;
import br.com.marvelapi.marvelapi.entity.Character;
import br.com.marvelapi.marvelapi.worker.CharacterWorker;
import br.com.marvelapi.marvelapi.worker.MarvelIntegration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("v1/public/characters")
public class CharacterController {

    private final CharacterWorker characterWorker;
    private final MarvelIntegration marvelIntegration;

    public CharacterController(CharacterDao characterDao, ComicsDao comicsDao, EventsDao eventsDao, SeriesDao seriesDao,
                               StoriesDao storiesDao) {
        this.characterWorker = new CharacterWorker(characterDao, comicsDao, eventsDao, seriesDao, storiesDao);
        this.marvelIntegration = new MarvelIntegration(characterDao, comicsDao, eventsDao, seriesDao, storiesDao);
    }

    @GetMapping("/")
    public List<Character> getAllCharacters() {
        return characterWorker.findAll();
    }

    @GetMapping("/{characterId}")
    public Character getCharacterById(@PathVariable String characterId) {
        return characterWorker.findCharacterById(characterId);
    }

    @GetMapping("/{characterId}/comics")
    public List<Comics> findComicsByCharacterId(@PathVariable String characterId) {
        return characterWorker.findComicsByCharacterId(characterId);
    }

    @GetMapping("/{characterId}/events")
    public List<Events> findEventsByCharacterId(@PathVariable String characterId) {
        return characterWorker.findEventsByCharacterId(characterId);
    }

    @GetMapping("/{characterId}/series")
    public List<Series> findSeriesByCharacterId(@PathVariable String characterId) {
        return characterWorker.findSeriesByCharacterId(characterId);
    }

    @GetMapping("/{characterId}/stories")
    public List<Stories> findStoriesByCharacterId(@PathVariable String characterId) {
        return characterWorker.findStoriesByCharacterId(characterId);
    }

    //extra endpoint - Salva um novo Character pelo Id da marvel
    @GetMapping("/{customCharacterId}/save")
    public Character findAndSaveByCustomCharacterId(@PathVariable String customCharacterId) throws IOException {
        return marvelIntegration.pullIntegrationOnline(customCharacterId);
    }

}
