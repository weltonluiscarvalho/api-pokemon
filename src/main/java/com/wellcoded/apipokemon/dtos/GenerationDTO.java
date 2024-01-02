package com.wellcoded.apipokemon.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class GenerationDTO {

    @JsonProperty("generation_id")
    private Integer id;

    @JsonProperty("release_date")
    private Date releaseDate;

    @JsonProperty("total_pokemon")
    private Integer numberOfPokemons;

    @JsonProperty("generation_description")
    private String description;

    @JsonProperty("pokemon_of_this_generation")
    private List<PokemonEntity> pokemons;
}
