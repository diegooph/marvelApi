
package br.com.marvelapi.marvelapi.dto.MarvelDto;

import java.util.List;
import javax.annotation.Generated;

import br.com.marvelapi.marvelapi.entity.Comics;
import br.com.marvelapi.marvelapi.entity.Events;
import br.com.marvelapi.marvelapi.entity.Series;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SeriesApiMarvelDto {

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
    @SerializedName("startYear")
    @Expose
    private Integer startYear;
    @SerializedName("endYear")
    @Expose
    private Integer endYear;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("modified")
    @Expose
    private String modified;
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
    @SerializedName("events")
    @Expose
    private EventsDto eventsDto;
    @SerializedName("next")
    @Expose
    private Object next;
    @SerializedName("previous")
    @Expose
    private Object previous;

    public Series convertToEntity() {
        Series series = new Series();
        series.setCustomId(this.id+"");
        series.setDescription(this.description);
        series.setTitle(this.title);
        series.setModified(this.modified);
        series.setType(this.type);
        series.setStartYear(this.startYear);
        series.setEndYear(this.endYear);
        series.setRating(this.rating);
        return series;
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

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public EventsDto getEvents() {
        return eventsDto;
    }

    public void setEvents(EventsDto eventsDto) {
        this.eventsDto = eventsDto;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }


}
