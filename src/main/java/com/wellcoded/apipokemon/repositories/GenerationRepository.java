package com.wellcoded.apipokemon.repositories;

import com.wellcoded.apipokemon.entities.GenerationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerationRepository extends JpaRepository<GenerationEntity, Integer> {
}
