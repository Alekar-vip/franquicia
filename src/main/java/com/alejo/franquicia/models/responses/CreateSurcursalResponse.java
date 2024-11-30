package com.alejo.franquicia.models.responses;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Contiene informacion basica de surcursal creada")
public record CreateSurcursalResponse(
        @Schema(description = "surcursal")
        String nombre,

        @Schema(description = "Identificador único de la franquicia asociada")
        Long idFranquicia
) {
}
