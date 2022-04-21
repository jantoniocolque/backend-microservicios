package com.dh.catalogservice.domain.repositories;

import com.dh.catalogservice.domain.models.dto.SerieWS;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SerieWSRepository extends MongoRepository<SerieWS,String> {
}
