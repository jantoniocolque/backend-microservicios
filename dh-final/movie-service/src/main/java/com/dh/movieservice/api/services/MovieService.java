package com.dh.movieservice.api.services;

import com.dh.movieservice.domain.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getListByGenre(String genre);
    Movie save(Movie movie);
}
