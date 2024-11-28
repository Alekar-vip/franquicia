package com.alejo.franquicia.controller;

import com.alejo.franquicia.models.domains.Franquicia;
import com.alejo.franquicia.models.mappers.FranquiciaRequestResponseMapper;
import com.alejo.franquicia.models.requests.CreateFranquiciaRequest;
import com.alejo.franquicia.models.responses.CreateFranquiciaResponse;
import com.alejo.franquicia.service.FranquiciaService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FranquiciaController {

    final FranquiciaService franquiciaService;
    final FranquiciaRequestResponseMapper franquiciaRequestResponseMapper;

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Crear una nueva franquicia")
    public ResponseEntity<CreateFranquiciaResponse> createFranquicia (@RequestBody @Valid CreateFranquiciaRequest request) {
        var franquicia = new Franquicia(request.nombre());
        var response = franquiciaService.createFranquicia(franquicia);
        return ResponseEntity.status(HttpStatus.CREATED).body(franquiciaRequestResponseMapper.franquiciaDomainToCreateFranquiciaResponse(response));
    }


}
