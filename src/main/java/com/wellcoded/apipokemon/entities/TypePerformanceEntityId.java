package com.wellcoded.apipokemon.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class TypePerformanceEntityId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "type_attacker_id")
    private TypeEntity typeAttacker;

    @ManyToOne
    @JoinColumn(name = "type_defenser_id")
    private TypeEntity typeDefenser;
}
