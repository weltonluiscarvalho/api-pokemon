package com.wellcoded.apipokemon.services.mappers;

import com.wellcoded.apipokemon.dtos.PokemonDTO;
import com.wellcoded.apipokemon.entities.AbilityEntity;
import com.wellcoded.apipokemon.entities.GenerationEntity;
import com.wellcoded.apipokemon.entities.PokemonEntity;
import com.wellcoded.apipokemon.entities.TypeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

    PokemonMapper INSTANCE = Mappers.getMapper(PokemonMapper.class);

    PokemonDTO entityToDTO(PokemonEntity pokemonEntity);

    default Integer mapGenerationEntityToGenerationId(GenerationEntity generationEntity) {
        return generationEntity.getId();
    }

    default String mapTypeEntityToTypeName(TypeEntity typeEntity) {
        return typeEntity.getName();
    }

    default String mapAbilityEntityToAbilityName(AbilityEntity abilityEntity) {
        return abilityEntity.getName();
    }
}
