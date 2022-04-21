package com.dh.catalogservice.domain.repositories;

import com.dh.catalogservice.domain.models.dto.MovieWS;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movies-service")
public interface MovieRepository {
    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieWS>> getMovieByGenre(@PathVariable String genre);
}
