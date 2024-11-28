package com.alejo.franquicia.models.responses;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Contiene informacion basica de franquicia creada")
public record CreateFranquiciaResponse(@Schema(description = "ejemplo") String nombre) {
}
