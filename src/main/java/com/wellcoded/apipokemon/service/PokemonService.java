package com.wellcoded.apipokemon.service;

import com.wellcoded.apipokemon.dto.PokemonDTO;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import com.wellcoded.apipokemon.repositories.PokemonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PokemonDTO findPokemonById(Integer id) {

        Optional<PokemonEntity> dbResult = pokemonRepository.findById(id);

        return dbResult.map(entity -> modelMapper.map(entity, PokemonDTO.class)).orElseThrow();
    }
}
