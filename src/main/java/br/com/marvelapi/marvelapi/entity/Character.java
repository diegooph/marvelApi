package br.com.marvelapi.marvelapi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marvelcharacter")
public class Character {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int characterId;
    private String customId;
    private String name;
    @Lob
    private String description;
    private String modified;
    private String resourceURI;

    @ManyToMany(fetch = FetchType.LAZY,targetEntity = Comics.class,cascade = CascadeType.PERSIST)
    private List<Comics> comics;

    @ManyToMany(fetch = FetchType.LAZY,targetEntity = Series.class,cascade = CascadeType.PERSIST)
    private List<Series> series;

    @ManyToMany(fetch = FetchType.LAZY,targetEntity = Stories.class,cascade = CascadeType.PERSIST)
    private List<Stories> stories;

    @ManyToMany(fetch = FetchType.LAZY,targetEntity = Events.class,cascade = CascadeType.PERSIST)
    private List<Events> events;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public List<Comics> getComics() {
        return comics;
    }

    public void setComics(List<Comics> comics) {
        this.comics = comics;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }

    public List<Stories> getStories() {
        return stories;
    }

    public void setStories(List<Stories> stories) {
        this.stories = stories;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }


}
