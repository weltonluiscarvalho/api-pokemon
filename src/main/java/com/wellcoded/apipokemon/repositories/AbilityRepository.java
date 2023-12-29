package com.wellcoded.apipokemon.repositories;

import com.wellcoded.apipokemon.entities.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilityRepository extends JpaRepository<AbilityEntity, Integer> {
}
