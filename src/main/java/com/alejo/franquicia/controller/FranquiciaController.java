package com.alejo.franquicia.controller;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FranquiciaController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("Hello World");
    }
}
