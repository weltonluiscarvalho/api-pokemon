package com.wellcoded.apipokemon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PokemonDTO {

    @JsonProperty("pokedex_number")
    private int nationalNumber;

    @JsonProperty("name")
    private String name;

    @JsonProperty("generation")
    private Integer generation;

    @JsonProperty("types")
    private List<TypeDTO> types;

    @JsonProperty("abilities")
    private List<AbilityDTO> abilities;
}
