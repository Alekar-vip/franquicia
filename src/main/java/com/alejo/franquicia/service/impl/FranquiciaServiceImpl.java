package com.alejo.franquicia.service.impl;

import com.alejo.franquicia.models.domains.Franquicia;
import com.alejo.franquicia.models.mappers.FranquiciaEntityMapper;
import com.alejo.franquicia.repositories.FranquiciaRepository;
import com.alejo.franquicia.service.FranquiciaService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Service
public class FranquiciaServiceImpl implements FranquiciaService {

    final FranquiciaRepository franquiciaRepository;

    final FranquiciaEntityMapper franquiciaEntityMapper;

    @Override
    public Franquicia createFranquicia(Franquicia franquicia) {
        var entity = franquiciaRepository.save(franquiciaEntityMapper.fromFranquicia(franquicia));
        return franquiciaEntityMapper.franquiciaEntityToFranquicia(entity);
    }
}
