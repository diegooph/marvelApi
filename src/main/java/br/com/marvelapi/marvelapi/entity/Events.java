package br.com.marvelapi.marvelapi.entity;

import javax.persistence.*;

@Entity
public class Events {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int eventsId;

    private String customId;
    private String title;
    @Lob
    private String description;
    private String resourceURI;
    private String modified;
    private String start;
    private String end;

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

    public int getEventsId() {
        return eventsId;
    }

    public void setEventsId(int eventsId) {
        this.eventsId = eventsId;
    }

}
