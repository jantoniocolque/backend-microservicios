package com.dh.seriesservice.domain.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Document(collation = "seasons")
public class Season {
    @Id
    private String id;
    private Integer seasonNumber;
    @DBRef
    private List<Chapter> chapters;

    public Season(String id, Integer seasonNumber, List<Chapter> chapters) {
        this.id = id;
        this.seasonNumber = seasonNumber;
        this.chapters = chapters;
    }

    public Season() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(Integer seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
