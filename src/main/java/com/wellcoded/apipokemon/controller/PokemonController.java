package com.wellcoded.apipokemon.controller;

import com.wellcoded.apipokemon.dto.PokemonDTO;
import com.wellcoded.apipokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{id}")
    public ResponseEntity<PokemonDTO> searchPokemonById(@PathVariable String id) {
        return ResponseEntity.ok(pokemonService.findPokemonById(Integer.parseInt(id)));
    }
}
