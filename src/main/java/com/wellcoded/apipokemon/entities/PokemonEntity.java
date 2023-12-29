package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon_table")
public class PokemonEntity {

    @Id
    @Column(name = "pokemon_id")
    private Integer id;

    @Column(name = "national_number")
    private int nationalNumber;

    @Column(name = "pokemon_name")
    private String name;

    @Column(name = "generation_id")
    private int generation;
}
