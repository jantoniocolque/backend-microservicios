package com.dh.catalogservice.queue;

import com.dh.catalogservice.api.services.MovieWSService;
import com.dh.catalogservice.api.services.SerieWSService;
import com.dh.catalogservice.domain.models.dto.MovieWS;
import com.dh.catalogservice.domain.models.dto.SerieWS;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Listener {
    @Autowired
    private MovieWSService movieWSService;

    @Autowired
    private SerieWSService serieWSService;

    @RabbitListener(queues = {"${queue.movie.name}"})
    public void receive(@Payload MovieWS movieWS){
        log.info("Se guarda la pelicula con titulo {}",movieWS.getName());
        movieWSService.saveMovieWS(movieWS);
    }

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receive(@Payload SerieWS serieWS){
        log.info("Se guardo la serie con titulo {}",serieWS.getName());
        serieWSService.addSerieWS(serieWS);
    }
}
