package com.wellcoded.apipokemon.repositories;

import com.wellcoded.apipokemon.entities.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {
}
