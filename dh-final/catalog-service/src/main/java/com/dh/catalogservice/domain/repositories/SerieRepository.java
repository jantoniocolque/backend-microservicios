package com.dh.catalogservice.domain.repositories;

import com.dh.catalogservice.domain.models.dto.SerieWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "series-service")
public interface SerieRepository {
    @GetMapping("/series/{genre}")
    ResponseEntity<List<SerieWS>> findSeriesByGenre(@PathVariable String genre);
}
