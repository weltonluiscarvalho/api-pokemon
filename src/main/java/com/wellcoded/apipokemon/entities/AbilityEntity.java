package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ability_table")
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
}
