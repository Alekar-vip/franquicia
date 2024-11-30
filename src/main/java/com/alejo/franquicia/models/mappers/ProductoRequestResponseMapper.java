package com.alejo.franquicia.models.mappers;

import com.alejo.franquicia.models.domains.Producto;
import com.alejo.franquicia.models.responses.CreateProductoResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoRequestResponseMapper {

    CreateProductoResponse productoToProductoResponse(Producto producto);
}
