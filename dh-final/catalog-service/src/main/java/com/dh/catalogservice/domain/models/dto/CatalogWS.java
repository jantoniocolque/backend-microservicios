package com.dh.catalogservice.domain.models.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class CatalogWS {

    private String genre;
    private List<MovieWS> movies;
    private List<SerieWS> series;
}
