package com.mariusapps.recetas.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariusapps.recetas.backend.integration.model.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Long>{

}
