package com.dh.catalogservice.domain.models.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Document(collection = "seriesWS")
public class SerieWS {
    @Id
    private String id;
    private String name;
    private String genre;
    private List<SeasonWS> seasons;
}
