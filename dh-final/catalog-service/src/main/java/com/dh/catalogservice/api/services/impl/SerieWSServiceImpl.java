package com.dh.catalogservice.api.services.impl;

import com.dh.catalogservice.api.services.SerieWSService;
import com.dh.catalogservice.domain.models.dto.SerieWS;
import com.dh.catalogservice.domain.repositories.SerieWSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieWSServiceImpl implements SerieWSService {
    @Autowired
    private SerieWSRepository serieRepository;

    @Override
    public SerieWS addSerieWS(SerieWS serieWS) {
        return serieRepository.save(serieWS);
    }
}
