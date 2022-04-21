package com.dh.catalogservice.api.controllers;

import com.dh.catalogservice.api.services.CatalogService;
import com.dh.catalogservice.domain.models.dto.CatalogWS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/catalog")
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/{genre}")
    ResponseEntity<CatalogWS> getCatalogByGenre(@PathVariable String genre) {
        log.info("Catalogo buscado con genero {}",genre);
        return ResponseEntity.ok(catalogService.getCatalogByGenre(genre));
    }
}
