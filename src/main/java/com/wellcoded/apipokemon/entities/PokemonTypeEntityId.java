package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class PokemonTypeEntityId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private PokemonEntity pokemon;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeEntity type;
}
