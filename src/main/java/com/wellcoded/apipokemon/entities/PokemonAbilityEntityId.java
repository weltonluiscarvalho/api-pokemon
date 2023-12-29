package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class PokemonAbilityEntityId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private PokemonEntity pokemon;

    @ManyToOne
    @JoinColumn(name = "ability_id")
    private AbilityEntity ability;
}
