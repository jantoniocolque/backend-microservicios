package com.dh.seriesservice.queue;

import com.dh.seriesservice.api.services.SerieService;
import com.dh.seriesservice.domain.models.Serie;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SerieSender {
    private final SerieService movieService;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queueSerie;


    public Serie send(Serie serie){
        rabbitTemplate.convertAndSend(queueSerie.getName(),movieService.addSeries(serie));
        return serie;
    }
}
