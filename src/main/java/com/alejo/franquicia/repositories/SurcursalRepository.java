package com.alejo.franquicia.repositories;

import com.alejo.franquicia.models.entities.SurcursalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurcursalRepository extends JpaRepository<SurcursalEntity, Long> {
}
