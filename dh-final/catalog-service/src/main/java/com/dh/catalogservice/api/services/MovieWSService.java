package com.dh.catalogservice.api.services;

import com.dh.catalogservice.domain.models.dto.MovieWS;

import java.util.List;

public interface MovieWSService {
    MovieWS saveMovieWS(MovieWS movieWS);
    List<MovieWS> findMoviesByGenre(String genre);
}
