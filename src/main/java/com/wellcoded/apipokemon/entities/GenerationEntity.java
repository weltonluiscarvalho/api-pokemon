package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "generation_table")
public class GenerationEntity {

    @Id
    @Column(name = "generation_id")
    private int id;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "number_of_pokemons")
    private int numberOfPokemons;

    @Column(name = "generation_description")
    private String description;
}
