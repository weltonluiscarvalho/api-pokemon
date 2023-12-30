package com.wellcoded.apipokemon.controller;

import com.wellcoded.apipokemon.dto.PokemonDTO;
import com.wellcoded.apipokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{id}")
    public ResponseEntity<PokemonDTO> searchPokemonById() {
        return null;
    }
}
