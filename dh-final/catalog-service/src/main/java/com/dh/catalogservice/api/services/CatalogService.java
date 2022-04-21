package com.dh.catalogservice.api.services;

import com.dh.catalogservice.domain.models.dto.CatalogWS;

public interface CatalogService {
    CatalogWS getCatalogByGenre(String genre);
}
