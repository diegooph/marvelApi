package br.com.marvelapi.marvelapi.controller;

import br.com.marvelapi.marvelapi.dao.*;
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
    public Character getCharacterById(@PathVariable int characterId) {
        return characterWorker.findCharacterById(characterId);
    }

    @GetMapping("/{characterId}/comics")
    public List<Character> findComicsByCharacterId(@PathVariable int characterId) {
        return characterWorker.findComicsByCharacterId();
    }

    @GetMapping("/{characterId}/events")
    public List<Character> findEventsByCharacterId(@PathVariable int characterId) {
        return characterWorker.findEventsByCharacterId();
    }

    @GetMapping("/{characterId}/series")
    public List<Character> findSeriesByCharacterId(@PathVariable int characterId) {
        return characterWorker.findSeriesByCharacterId();
    }

    @GetMapping("/{characterId}/stories")
    public List<Character> findStoriesByCharacterId(@PathVariable int characterId) {
        return characterWorker.findStoriesByCharacterId();
    }

    //extra endpoint - Salva um novo Character pelo Id da marvel
    @GetMapping("/{customCharacterId}/save")
    public Character findAndSaveByCustomCharacterId(@PathVariable String customCharacterId) throws IOException {
        return marvelIntegration.pullIntegrationOnline(customCharacterId);
    }

}
