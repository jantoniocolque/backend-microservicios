package com.dh.movieservice.api.controllers;

import com.dh.movieservice.api.services.MovieService;
import com.dh.movieservice.domain.models.Movie;
import com.dh.movieservice.queue.MovieSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/movies")
public class MovieController {
    private MovieService movieService;

    private MovieSender movieSender;

    @Autowired
    public MovieController(MovieService movieService, MovieSender movieSender) {
        this.movieService = movieService;
        this.movieSender = movieSender;
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> getMovieByGenre(@PathVariable String genre) {
        log.info("Peliculas buscadas con el genero {}",genre);
        return ResponseEntity.ok().body(movieService.getListByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        log.info("Se creo la pelicula {} con el genero {}",movie.getName(),movie.getGenre());
        return ResponseEntity.ok().body(movieSender.send(movie));
    }
}
