package com.alejo.franquicia.models.requests;


import jakarta.validation.constraints.NotBlank;


public record CreateFranquiciaRequest(
        @NotBlank(message = "El nombre de la franquicia no puede estar vacio")
        String nombre
) {

}
