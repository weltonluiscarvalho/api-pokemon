package com.wellcoded.apipokemon.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "type_performance_table")
public class TypePerformanceEntity {

    @EmbeddedId
    private TypePerformanceEntityId id;

    @Column(name = "multiplier")
    private Float multiplier;
}
