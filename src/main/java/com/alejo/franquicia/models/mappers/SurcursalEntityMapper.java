package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.entities.FranquiciaEntity;
import com.alejo.franquicia.models.entities.SurcursalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface SurcursalEntityMapper {


    @Mapping(target = "franquicia", source = "idFranquicia", qualifiedByName = "mapIdToFranquicia")
    SurcursalEntity surcursalToEntity(Surcursal surcursal);


    @Mapping(target = "idFranquicia", source = "franquicia.id")
    Surcursal surcursalEntityToSurcursal(SurcursalEntity surcursalEntity);

    @Named("mapIdToFranquicia")
    default FranquiciaEntity mapIdToFranquicia(Long idFranquicia) {
        if (idFranquicia == null) {
            return null;
        }
        FranquiciaEntity franquicia = new FranquiciaEntity();
        franquicia.setId(idFranquicia);
        return franquicia;
    }


}
