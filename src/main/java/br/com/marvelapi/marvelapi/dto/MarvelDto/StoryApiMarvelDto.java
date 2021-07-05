
package br.com.marvelapi.marvelapi.dto.MarvelDto;

import javax.annotation.Generated;

import br.com.marvelapi.marvelapi.entity.Events;
import br.com.marvelapi.marvelapi.entity.Stories;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class StoryApiMarvelDto {

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
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("thumbnail")
    @Expose
    private Object thumbnail;
    @SerializedName("creators")
    @Expose
    private CreatorsDto creatorsDto;
    @SerializedName("characters")
    @Expose
    private CharactersDto charactersDto;
    @SerializedName("series")
    @Expose
    private SeriesDto seriesDto;
    @SerializedName("comics")
    @Expose
    private ComicsDto comicsDto;
    @SerializedName("events")
    @Expose
    private EventsDto eventsDto;
    @SerializedName("originalIssue")
    @Expose
    private OriginalIssueDto originalIssueDto;

    public Stories convertToEntity() {
        Stories stories = new Stories();
        stories.setCustomId(this.id+"");
        stories.setDescription(this.description);
        stories.setTitle(this.title);
        stories.setModified(this.modified);
        return stories;
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

    public Object getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Object thumbnail) {
        this.thumbnail = thumbnail;
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

    public SeriesDto getSeries() {
        return seriesDto;
    }

    public void setSeries(SeriesDto seriesDto) {
        this.seriesDto = seriesDto;
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

    public OriginalIssueDto getOriginalIssue() {
        return originalIssueDto;
    }

    public void setOriginalIssue(OriginalIssueDto originalIssueDto) {
        this.originalIssueDto = originalIssueDto;
    }

}
