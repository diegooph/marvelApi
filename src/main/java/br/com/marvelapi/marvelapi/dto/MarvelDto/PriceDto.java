package br.com.marvelapi.marvelapi.dto.MarvelDto;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PriceDto {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("price")
    @Expose
    private String price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
