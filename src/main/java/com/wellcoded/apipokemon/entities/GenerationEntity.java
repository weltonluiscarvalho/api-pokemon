package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "generation_table")
public class GenerationEntity {

    @Id
    @Column(name = "generation_id")
    private Integer id;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "number_of_pokemons")
    private Integer numberOfPokemons;

    @Column(name = "generation_description")
    private String description;

    @Transient
    @OneToMany
    @JoinColumn(name = "generation_id")
    private List<PokemonEntity> pokemons;
}
