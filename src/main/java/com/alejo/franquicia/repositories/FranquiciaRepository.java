package com.alejo.franquicia.repositories;

import com.alejo.franquicia.models.entities.FranquiciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranquiciaRepository extends JpaRepository<FranquiciaEntity, Long> {
}
