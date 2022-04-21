package com.dh.catalogservice.domain.repositories;
import com.dh.catalogservice.domain.models.dto.MovieWS;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
public interface MovieWSRepository extends MongoRepository<MovieWS,Integer>{
    List<MovieWS> findAllByGenre(String genre);
}
