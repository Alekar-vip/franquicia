package com.alejo.franquicia.models.requests;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Objeto de entrada para crear una franquicia")
public record CreateFranquiciaRequest(
        @NotBlank(message = "El nombre de la franquicia no puede estar vacio")
        String nombre
) {

}
