package com.wellcoded.apipokemon.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import com.wellcoded.apipokemon.entities.TypeEntity;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDTO {

    @JsonProperty("type_name")
    private String name;

    @JsonProperty("pokemon_of_this_type")
    private List<PokemonEntity> pokemons;

    @JsonProperty("deals_double_damage_to")
    private List<TypeEntity> dealsDoubleDamage;

    @JsonProperty("deals_normal_damage_to")
    private List<TypeEntity> dealsCommonDamage;

    @JsonProperty("deals_half_damage_to")
    private List<TypeEntity> dealsHalfDamage;

    @JsonProperty("deals_no_damage_to")
    private List<TypeEntity> dealsNoDamage;

    @JsonProperty("takes_double_damage_from")
    private List<TypeEntity> takeDoubleDamage;

    @JsonProperty("takes_common_damage_from")
    private List<TypeEntity> takeCommonDamage;

    @JsonProperty("takes_half_damage_from")
    private List<TypeEntity> takeHalfDamage;

    @JsonProperty("takes_no_damage_from")
    private List<TypeEntity> takesNoDamage;
}
