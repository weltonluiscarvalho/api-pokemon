package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "type_table")
public class TypeEntity {

    @Id
    @Column(name = "type_id")
    private Integer id;

    @Column(name = "type_name")
    private String name;

    @Transient
    @ManyToMany(mappedBy = "types")
    private List<PokemonEntity> pokemons;

    @Transient
    private List<TypeEntity> dealsDoubleDamage;

    @Transient
    private List<TypeEntity> dealsCommonDamage;

    @Transient
    private List<TypeEntity> dealsHalfDamage;

    @Transient
    private List<TypeEntity> dealsNoDamage;

    @Transient
    private List<TypeEntity> takeDoubleDamage;

    @Transient
    private List<TypeEntity> takeHalfDamage;

    @Transient
    private List<TypeEntity> takesNoDamage;
}
