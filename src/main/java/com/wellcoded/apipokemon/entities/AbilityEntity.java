package com.wellcoded.apipokemon.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ability_table")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbilityEntity {

    @Id
    @Column(name = "ability_id")
    private Integer id;

    @Column(name = "ability_name")
    private String name;

    @Column(name = "ability_description")
    private String description;

    @Column(name = "ability_generation")
    private Integer generation;

    @Transient
    @ManyToMany(mappedBy = "abilities")
    private List<PokemonEntity> pokemons;
}
