package com.dh.catalogservice.domain.models.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class ChapterWS {
    private String id;
    private String name;
    private Integer number;
    private String urlStream;
}
