package com.wellcoded.apipokemon.repositories;

import com.wellcoded.apipokemon.entities.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {

    Optional<PokemonEntity> findByNationalNumber(Integer nationalNumber);
}
