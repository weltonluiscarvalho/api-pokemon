package com.wellcoded.apipokemon.repositories;

import com.wellcoded.apipokemon.entities.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<TypeEntity, Integer> {
}
