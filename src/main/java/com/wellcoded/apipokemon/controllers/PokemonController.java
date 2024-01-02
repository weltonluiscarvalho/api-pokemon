package com.wellcoded.apipokemon.controllers;

import com.wellcoded.apipokemon.dtos.PokemonDTO;
import com.wellcoded.apipokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/{nationalNumber}")
    public ResponseEntity<PokemonDTO> searchPokemonByNationalNumber(@PathVariable Integer nationalNumber) {
        return ResponseEntity.ok(pokemonService.findPokemonByNationalNumber(nationalNumber));
    }

    @GetMapping
    public ResponseEntity<PokemonDTO> searchPokemonByName(@RequestParam String name) {
        return ResponseEntity.ok(pokemonService.findPokemonByName(name));
    }
}
