package com.dh.seriesservice.api.services;

import com.dh.seriesservice.domain.models.Serie;

import java.util.List;

public interface SerieService {
    public Serie addSeries(Serie series);
    public List<Serie> findSeriesByGenre(String genre);
}
