package com.dh.catalogservice.domain.models.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data @NoArgsConstructor
@AllArgsConstructor
public class SeasonWS {
    private String id;
    private Integer seasonNumber;
    private List<ChapterWS> chapters;
}
