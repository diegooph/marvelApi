package br.com.marvelapi.marvelapi.dto.MarvelDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class EventsDto {

    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;
    @SerializedName("items")
    @Expose
    private List<ItemDto> itemDtos = null;
    @SerializedName("returned")
    @Expose
    private Integer returned;

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    public List<ItemDto> getItems() {
        return itemDtos;
    }

    public void setItems(List<ItemDto> itemDtos) {
        this.itemDtos = itemDtos;
    }

    public Integer getReturned() {
        return returned;
    }

    public void setReturned(Integer returned) {
        this.returned = returned;
    }

}
