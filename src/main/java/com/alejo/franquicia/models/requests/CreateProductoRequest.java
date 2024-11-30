package com.alejo.franquicia.models.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "Objeto de entrada para crear un producto")
public record CreateProductoRequest(

        @NotBlank(message = "El nombre del productop no puede estar vacio")
        String nombre,

        @NotNull(message = "Ingrsar cantidad stock del producto")
        int cantidadStock,

        @NotNull(message = "Ingresar el id surcursal a la que pertenece el producto")
        Long idSurcursal

) {


}
