package br.com.marvelapi.marvelapi.dto.MarvelDto;

import java.util.List;
import javax.annotation.Generated;

import br.com.marvelapi.marvelapi.entity.Comics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ComicApiMarvelDto {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("digitalId")
    @Expose
    private Integer digitalId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("issueNumber")
    @Expose
    private Integer issueNumber;
    @SerializedName("variantDescription")
    @Expose
    private String variantDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("diamondCode")
    @Expose
    private String diamondCode;
    @SerializedName("ean")
    @Expose
    private String ean;
    @SerializedName("issn")
    @Expose
    private String issn;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("textObjects")
    @Expose
    private List<TextObjectDto> textObjectDtos = null;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("urls")
    @Expose
    private List<UrlDto> urlDtos = null;
    @SerializedName("series")
    @Expose
    private SeriesDto seriesDto;
    @SerializedName("variants")
    @Expose
    private List<Object> variants = null;
    @SerializedName("collections")
    @Expose
    private List<Object> collections = null;
    @SerializedName("collectedIssues")
    @Expose
    private List<Object> collectedIssues = null;
    @SerializedName("dates")
    @Expose
    private List<DateDto> dateDtos = null;
    @SerializedName("prices")
    @Expose
    private List<PriceDto> priceDtos = null;
    @SerializedName("thumbnail")
    @Expose
    private ThumbnailDto thumbnailDto;
    @SerializedName("images")
    @Expose
    private List<ImageDto> imageDtos = null;
    @SerializedName("creators")
    @Expose
    private CreatorsDto creatorsDto;
    @SerializedName("characters")
    @Expose
    private CharactersDto charactersDto;
    @SerializedName("stories")
    @Expose
    private StoriesDto storiesDto;
    @SerializedName("events")
    @Expose
    private EventsDto eventsDto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public List<TextObjectDto> getTextObjects() {
        return textObjectDtos;
    }

    public void setTextObjects(List<TextObjectDto> textObjectDtos) {
        this.textObjectDtos = textObjectDtos;
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

    public SeriesDto getSeries() {
        return seriesDto;
    }

    public void setSeries(SeriesDto seriesDto) {
        this.seriesDto = seriesDto;
    }

    public List<Object> getVariants() {
        return variants;
    }

    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<Object> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    public List<DateDto> getDates() {
        return dateDtos;
    }

    public void setDates(List<DateDto> dateDtos) {
        this.dateDtos = dateDtos;
    }

    public List<PriceDto> getPrices() {
        return priceDtos;
    }

    public void setPrices(List<PriceDto> priceDtos) {
        this.priceDtos = priceDtos;
    }

    public ThumbnailDto getThumbnail() {
        return thumbnailDto;
    }

    public void setThumbnail(ThumbnailDto thumbnailDto) {
        this.thumbnailDto = thumbnailDto;
    }

    public List<ImageDto> getImages() {
        return imageDtos;
    }

    public void setImages(List<ImageDto> imageDtos) {
        this.imageDtos = imageDtos;
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

    public EventsDto getEvents() {
        return eventsDto;
    }

    public void setEvents(EventsDto eventsDto) {
        this.eventsDto = eventsDto;
    }
    public Comics convertToEntity() {
        Comics comic = new Comics();
        comic.setCustomId(this.id+"");
        comic.setDescription(this.description);
        comic.setIssueNumber(this.issueNumber);
        comic.setDigitalId(this.digitalId);
        comic.setTitle(this.title);
        comic.setVariantDescription(this.variantDescription);
        comic.setModified(this.modified);
        return comic;
    }
}
