package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Producto;
import com.alejo.franquicia.models.entities.FranquiciaEntity;
import com.alejo.franquicia.models.entities.ProductoEntity;
import com.alejo.franquicia.models.entities.SurcursalEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ProductoEntityMapper {

    @Mapping(target = "idSurcursal", source = "sucursal.id")
    Producto ProductoEntityToProducto(ProductoEntity productoEntity);

    @Mapping(target = "sucursal", source = "idSurcursal", qualifiedByName = "mapIdToSurcursal")
    ProductoEntity productoToProductoEntity(Producto producto);

    @Named("mapIdToSurcursal")
    default SurcursalEntity mapIdToSurcursal(Long idSurcursal) {
        if (idSurcursal == null) {
            return null;
        }
        SurcursalEntity surcursal = new SurcursalEntity();
        surcursal.setId(idSurcursal);
        return surcursal;
    }
}
