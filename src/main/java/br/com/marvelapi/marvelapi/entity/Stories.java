package br.com.marvelapi.marvelapi.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.persistence.*;

@Entity
public class Stories {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int characterId;
    @SerializedName("id")
    @Expose
    private String customId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    @Lob
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
}
