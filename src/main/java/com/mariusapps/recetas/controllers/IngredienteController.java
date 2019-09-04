package com.mariusapps.recetas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariusapps.recetas.backend.integration.model.Ingrediente;
import com.mariusapps.recetas.backend.integration.repositories.IngredienteRepository;

@RestController
public class IngredienteController {

	@Autowired
	private IngredienteRepository ingredienteRepository;
	
	@RequestMapping("/ingredientes")
	public List<Ingrediente> getAll() {
		return ingredienteRepository.findAll();
	}
	
	@RequestMapping("/ingredientes/{id}")
	public Ingrediente getById(@PathVariable ("id") Long id) {
		
		Optional<Ingrediente> optional = ingredienteRepository.findById(id);
		
		return optional.isPresent() ? optional.get() : null;
		
	}
	
}
