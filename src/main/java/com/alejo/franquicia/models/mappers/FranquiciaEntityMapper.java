package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Franquicia;
import com.alejo.franquicia.models.entities.FranquiciaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FranquiciaEntityMapper {

    @Mapping(target = "nombre", source = "nombre")
    FranquiciaEntity fromFranquicia(Franquicia franquicia);

    @Mapping(target = "nombre", source = "nombre")
    Franquicia franquiciaEntityToFranquicia(FranquiciaEntity entity);


}
