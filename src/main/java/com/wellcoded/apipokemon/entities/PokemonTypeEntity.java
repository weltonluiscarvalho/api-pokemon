package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon_type_table")
public class PokemonTypeEntity {

    @EmbeddedId
    private PokemonTypeEntityId id;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private PokemonEntity pokemon;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeEntity type;
}
