package com.wellcoded.apipokemon.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbilityDTO {

    @JsonProperty("ability_name")
    private String name;

    @JsonProperty("ability_description")
    private String description;

    @JsonProperty("ability_generation")
    private Integer generation;

    @JsonProperty("pokemon_with_this_ability")
    private List<PokemonEntity> pokemons;
}
