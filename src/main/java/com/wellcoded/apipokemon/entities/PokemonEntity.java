package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "generation_id", referencedColumnName = "generation_id")
    private GenerationEntity generation;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "pokemon_type_table",
            joinColumns = @JoinColumn(name = "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private List<TypeEntity> types;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "pokemon_ability_table",
            joinColumns = @JoinColumn(name = "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name = "ability_id")
    )
    private List<AbilityEntity> abilities;
}
