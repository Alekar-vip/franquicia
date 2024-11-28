package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Franquicia;
import com.alejo.franquicia.models.responses.CreateFranquiciaResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FranquiciaRequestResponseMapper {

    @Mapping(target = "nombre", source = "nombre")
    CreateFranquiciaResponse franquiciaDomainToCreateFranquiciaResponse(Franquicia franquicia);
}
