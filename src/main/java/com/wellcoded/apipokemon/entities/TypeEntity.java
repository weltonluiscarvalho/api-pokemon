package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "type_table")
public class TypeEntity {

    @Id
    @Column(name = "type_id")
    private int id;

    @Column(name = "type_name")
    private String name;
}
