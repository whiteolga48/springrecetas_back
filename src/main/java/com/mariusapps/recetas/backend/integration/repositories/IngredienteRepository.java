package com.mariusapps.recetas.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariusapps.recetas.backend.integration.model.Ingrediente;

@Repository
public interface IngredienteRepository extends JpaRepository<Ingrediente, Long>{

}
