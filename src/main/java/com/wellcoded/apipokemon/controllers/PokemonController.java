package com.wellcoded.apipokemon.controllers;

import com.wellcoded.apipokemon.dtos.PokemonDTO;
import com.wellcoded.apipokemon.services.PokemonService;
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

    @GetMapping("/{nationalNumber}")
    public ResponseEntity<PokemonDTO> searchPokemonByNationalNumber(@PathVariable String nationalNumber) {
        return ResponseEntity.ok(pokemonService.findPokemonByNationalNumber(Integer.parseInt(nationalNumber)));
    }
}
