package com.wellcoded.apipokemon.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PokemonDTO {

    @JsonProperty("national_number")
    private int nationalNumber;

    @JsonProperty("name")
    private String name;

    @JsonProperty("generation")
    private Integer generation;

    @JsonProperty("types")
    private List<String> types;

    @JsonProperty("abilities")
    private List<String> abilities;
}
