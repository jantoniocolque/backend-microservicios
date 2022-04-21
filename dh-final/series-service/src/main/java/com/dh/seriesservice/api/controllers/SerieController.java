package com.dh.seriesservice.api.controllers;

import com.dh.seriesservice.api.services.SerieService;
import com.dh.seriesservice.domain.models.Serie;
import com.dh.seriesservice.queue.SerieSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/series")
public class SerieController {
    @Autowired
    private SerieService serieService;
    @Autowired
    private SerieSender serieSender;

    @GetMapping("/{genre}")
    private ResponseEntity<List<Serie>> findSeriesByGenre(@PathVariable String genre){
        log.info("Se buscaron las series con genero {}",genre);
        return ResponseEntity.ok(serieService.findSeriesByGenre(genre));
    }

    @PostMapping()
    private ResponseEntity<Serie> addSerie(@RequestBody Serie serie){
        log.info("Se posteo las series con titulo {} y genero",serie.getName(),serie.getGenre());
        return ResponseEntity.ok(serieSender.send(serie));
    }
}
