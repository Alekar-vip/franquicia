package com.alejo.franquicia.models.responses;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Contiene informacion basica de producto creado")
public record CreateProductoResponse(

        @Schema(description = "Información nombre del producto creado")
        String nombre,

        @Schema(description = "Cantidad del producto")
        int cantidadStock,

        @Schema(description = "id de Surcursal relacionada")
        Long idSurcursal


) {
}
