package com.wellcoded.apipokemon.services;

import com.wellcoded.apipokemon.dtos.PokemonDTO;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import com.wellcoded.apipokemon.services.mappers.PokemonMapper;
import com.wellcoded.apipokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private PokemonMapper mapper;

    public PokemonDTO findPokemonByNationalNumber(Integer nationalNumber) {

        Optional<PokemonEntity> dbResult = pokemonRepository.findByNationalNumber(nationalNumber);

        return dbResult.map(entity -> mapper.INSTANCE.entityToDTO(entity)).orElseThrow();
    }
}
