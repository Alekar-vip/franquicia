package com.alejo.franquicia.models.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "Objeto de entrada para crear una surcursal")
public record CreateSurcursalRequest(
        @NotBlank(message = "El nombre de la surcursal no puede estar vacido")
        String nombre,

        @NotNull(message = "El ID de la franquicia es obligatorio")
        Long idFranquicia
) {

}
