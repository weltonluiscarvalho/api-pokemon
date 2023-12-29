package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "type_performance_table")
public class TypePerformanceEntity {

    @EmbeddedId
    private TypePerformanceEntityId id;

    @ManyToOne
    @JoinColumn(name = "type_attacker_id")
    private TypeEntity typeAttacker;

    @ManyToOne
    @JoinColumn(name = "type_defenser_id")
    private TypeEntity typeDefenser;

    @Column(name = "multiplier")
    private Float multiplier;
}
