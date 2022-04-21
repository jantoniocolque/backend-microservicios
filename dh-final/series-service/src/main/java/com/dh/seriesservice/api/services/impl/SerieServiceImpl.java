package com.dh.seriesservice.api.services.impl;

import com.dh.seriesservice.api.services.SerieService;
import com.dh.seriesservice.domain.models.Serie;
import com.dh.seriesservice.domain.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieServiceImpl implements SerieService {

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public Serie addSeries(Serie series) {
        return serieRepository.save(series);
    }

    @Override
    public List<Serie> findSeriesByGenre(String genre) {
        return serieRepository.findSeriesByGenre(genre);
    }
}
