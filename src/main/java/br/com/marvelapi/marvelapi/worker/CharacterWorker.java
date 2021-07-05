package br.com.marvelapi.marvelapi.worker;

import br.com.marvelapi.marvelapi.dao.*;
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


    public Character findCharacterById(Integer id){
        return characterDao.getById(id);
    }

    public List<Character> findAll(){
       return characterDao.findAll();
    }

    public List<Character> findComicsByCharacterId() {
        return null;
    }
    public List<Character> findEventsByCharacterId() {
        return null;
    }

    public List<Character> findSeriesByCharacterId() {
        return null;
    }

    public List<Character> findStoriesByCharacterId() {
        return null;
    }
}
