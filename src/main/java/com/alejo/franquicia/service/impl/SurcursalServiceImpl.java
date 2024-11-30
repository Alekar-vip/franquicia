package com.alejo.franquicia.service.impl;

import com.alejo.franquicia.models.domains.Surcursal;
import com.alejo.franquicia.models.mappers.SurcursalEntityMapper;
import com.alejo.franquicia.repositories.SurcursalRepository;
import com.alejo.franquicia.service.SurcursalService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Service
public class SurcursalServiceImpl implements SurcursalService {

    final SurcursalRepository surcursalRepository;
    final SurcursalEntityMapper surcursalEntityMapper;

    @Override
    public Surcursal createSurcursal(Surcursal surcursal) {
        var entity = surcursalRepository.save(surcursalEntityMapper.surcursalToEntity(surcursal));
        return surcursalEntityMapper.surcursalEntityToSurcursal(entity);
    }

}
