package com.dh.catalogservice.api.services.impl;

import com.dh.catalogservice.api.services.MovieWSService;
import com.dh.catalogservice.domain.models.dto.MovieWS;
import com.dh.catalogservice.domain.repositories.MovieWSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieWSServiceImpl implements MovieWSService {
    @Autowired
    private MovieWSRepository movieWSRepository;

    @Override
    public MovieWS saveMovieWS(MovieWS movieWS) {
        return movieWSRepository.save(movieWS);
    }

    @Override
    public List<MovieWS> findMoviesByGenre(String genre) {
        return movieWSRepository.findAllByGenre(genre);
    }
}
