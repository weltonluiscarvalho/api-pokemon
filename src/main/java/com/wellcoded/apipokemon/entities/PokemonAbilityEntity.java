package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon_ability_table")
public class PokemonAbilityEntity {

    @EmbeddedId
    private PokemonAbilityEntityId id;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private PokemonEntity pokemon;

    @ManyToOne
    @JoinColumn(name = "ability_id")
    private AbilityEntity ability;
}
