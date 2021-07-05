package br.com.marvelapi.marvelapi.dto.MarvelDto;

import java.util.List;
import javax.annotation.Generated;

import br.com.marvelapi.marvelapi.entity.Events;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class EventApiMarvelDto {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("urls")
    @Expose
    private List<UrlDto> urlDtos = null;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("start")
    @Expose
    private String start;
    @SerializedName("end")
    @Expose
    private String end;
    @SerializedName("thumbnail")
    @Expose
    private ThumbnailDto thumbnailDto;
    @SerializedName("creators")
    @Expose
    private CreatorsDto creatorsDto;
    @SerializedName("characters")
    @Expose
    private CharactersDto charactersDto;
    @SerializedName("stories")
    @Expose
    private StoriesDto storiesDto;
    @SerializedName("comics")
    @Expose
    private ComicsDto comicsDto;
    @SerializedName("series")
    @Expose
    private SeriesDto seriesDto;
    @SerializedName("next")
    @Expose
    private NextDto nextDto;
    @SerializedName("previous")
    @Expose
    private PreviousDto previousDto;

    public Events convertToEntity() {
        Events event = new Events();
        event.setCustomId(this.id+"");
        event.setDescription(this.description);
        event.setStart(this.start);
        event.setEnd(this.end);
        event.setTitle(this.title);
        event.setModified(this.modified);
        return event;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<UrlDto> getUrls() {
        return urlDtos;
    }

    public void setUrls(List<UrlDto> urlDtos) {
        this.urlDtos = urlDtos;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public ThumbnailDto getThumbnail() {
        return thumbnailDto;
    }

    public void setThumbnail(ThumbnailDto thumbnailDto) {
        this.thumbnailDto = thumbnailDto;
    }

    public CreatorsDto getCreators() {
        return creatorsDto;
    }

    public void setCreators(CreatorsDto creatorsDto) {
        this.creatorsDto = creatorsDto;
    }

    public CharactersDto getCharacters() {
        return charactersDto;
    }

    public void setCharacters(CharactersDto charactersDto) {
        this.charactersDto = charactersDto;
    }

    public StoriesDto getStories() {
        return storiesDto;
    }

    public void setStories(StoriesDto storiesDto) {
        this.storiesDto = storiesDto;
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

    public NextDto getNext() {
        return nextDto;
    }

    public void setNext(NextDto nextDto) {
        this.nextDto = nextDto;
    }

    public PreviousDto getPrevious() {
        return previousDto;
    }

    public void setPrevious(PreviousDto previousDto) {
        this.previousDto = previousDto;
    }

}
