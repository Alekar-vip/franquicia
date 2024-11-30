package com.alejo.franquicia.controller;


import com.alejo.franquicia.models.domains.Producto;
import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.mappers.ProductoRequestResponseMapper;
import com.alejo.franquicia.models.requests.CreateProductoRequest;
import com.alejo.franquicia.models.requests.CreateSurcursalRequest;
import com.alejo.franquicia.models.responses.CreateProductoResponse;
import com.alejo.franquicia.models.responses.CreateSurcursalResponse;
import com.alejo.franquicia.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductoController {

    final ProductoService productoService;
    final ProductoRequestResponseMapper productoRequestResponseMapper;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Crear un nuevo producto")
    public ResponseEntity<CreateProductoResponse> createFranquicia(@RequestBody @Valid CreateProductoRequest request) {
        var producto = new Producto(request.nombre(), request.cantidadStock(), request.idSurcursal());
        var response = productoService.createProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoRequestResponseMapper.productoToProductoResponse(response));
    }


}
