package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.entities.SurcursalEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurcursalEntityMapper {


    SurcursalEntity surcursalEntity(Surcursal surcursal);

    Surcursal surcursalEntityToSurcursal(SurcursalEntity surcursalEntity);


}
