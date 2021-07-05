package br.com.marvelapi.marvelapi.dto.MarvelDto;

import br.com.marvelapi.marvelapi.entity.Character;
import br.com.marvelapi.marvelapi.entity.Comics;
import br.com.marvelapi.marvelapi.entity.Series;
import br.com.marvelapi.marvelapi.entity.Stories;
import br.com.marvelapi.marvelapi.entity.Events;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;
import java.util.stream.Collectors;

@Generated("jsonschema2pojo")
public class CharacterApiMarvelDto {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("thumbnail")
    @Expose
    private ThumbnailDto thumbnailDto;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("comics")
    @Expose
    private ComicsDto comicsDto;
    @SerializedName("series")
    @Expose
    private SeriesDto seriesDto;
    @SerializedName("stories")
    @Expose
    private StoriesDto storiesDto;
    @SerializedName("events")
    @Expose
    private EventsDto eventsDto;
    @SerializedName("urls")
    @Expose
    private List<UrlDto> urlDtos = null;


    public Character convertDtoToEntity(){
        Character character = new Character();
        character.setCustomId(this.id+"");
        character.setDescription(this.description+"");
        character.setModified(this.modified+"");
        character.setName(this.name+"");
        character.setResourceURI(this.resourceURI+"");
        return character;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public ThumbnailDto getThumbnail() {
        return thumbnailDto;
    }

    public void setThumbnail(ThumbnailDto thumbnailDto) {
        this.thumbnailDto = thumbnailDto;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public ComicsDto getComics() {
        return comicsDto;
    }

    public void setComics(ComicsDto comicsDto) {
        this.comicsDto = comicsDto;
    }

    public SeriesDto getSeries() {
        return seriesDto;
    }

    public void setSeries(SeriesDto seriesDto) {
        this.seriesDto = seriesDto;
    }

    public StoriesDto getStories() {
        return storiesDto;
    }

    public void setStories(StoriesDto storiesDto) {
        this.storiesDto = storiesDto;
    }

    public EventsDto getEvents() {
        return eventsDto;
    }

    public void setEvents(EventsDto eventsDto) {
        this.eventsDto = eventsDto;
    }

    public List<UrlDto> getUrls() {
        return urlDtos;
    }

    public void setUrls(List<UrlDto> urlDtos) {
        this.urlDtos = urlDtos;
    }

}
