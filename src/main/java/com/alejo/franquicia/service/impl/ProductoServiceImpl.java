package com.alejo.franquicia.service.impl;

import com.alejo.franquicia.models.domains.Producto;
import com.alejo.franquicia.models.mappers.ProductoEntityMapper;
import com.alejo.franquicia.repositories.ProductoRepository;
import com.alejo.franquicia.service.ProductoService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {

    final ProductoRepository productoRepository;
    final ProductoEntityMapper productoEntityMapper;

    //TODO: se debe validar con el idSurcursal que la surcuirsal exista.

    @Override
    public Producto createProducto(Producto producto) {
        var entity = productoRepository.save(productoEntityMapper.productoToProductoEntity(producto));
        return productoEntityMapper.ProductoEntityToProducto(entity);
    }
}
