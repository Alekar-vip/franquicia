package com.alejo.franquicia.controller;

import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.mappers.SurcursalRequestResponseMapper;
import com.alejo.franquicia.models.requests.CreateSurcursalRequest;
import com.alejo.franquicia.models.responses.CreateSurcursalResponse;
import com.alejo.franquicia.service.SurcursalService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/surcursal")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SurcursalController {

    final SurcursalService surcursalService;
    final SurcursalRequestResponseMapper surcursalRequestResponseMapper;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Crear una nueva franquicia")
    public ResponseEntity<CreateSurcursalResponse> createFranquicia(@RequestBody @Valid CreateSurcursalRequest request) {
        var surcursal = new Surcursal(request.nombre(), request.idFranquicia());
        var response = surcursalService.createSurcursal(surcursal);
        return ResponseEntity.status(HttpStatus.CREATED).body(surcursalRequestResponseMapper.surcursalDomainToCreateSurcursalResponse(response));
    }
}
