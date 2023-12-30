package com.wellcoded.apipokemon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wellcoded.apipokemon.entities.AbilityEntity;
import com.wellcoded.apipokemon.entities.TypeEntity;
import lombok.Data;

import java.util.List;

@Data
public class PokemonDTO {

    @JsonProperty("pokemon_id")
    private Integer id;

    @JsonProperty("national_number")
    private int nationalNumber;

    @JsonProperty("pokemon_name")
    private String name;

    @JsonProperty("pokemon_generation")
    private Integer generation;

    @JsonProperty("pokemon_types")
    private List<TypeEntity> types;

    @JsonProperty("pokemon_abilities")
    private List<AbilityEntity> abilities;
}
