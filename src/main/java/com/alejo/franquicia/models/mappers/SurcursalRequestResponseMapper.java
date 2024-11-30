package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.responses.CreateSurcursalResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurcursalRequestResponseMapper {

    CreateSurcursalResponse surcursalDomainToCreateSurcursalResponse(Surcursal surcursal);
}
