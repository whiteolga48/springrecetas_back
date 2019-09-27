package com.mariusapps.recetas.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="/ingredientes",
			        method=RequestMethod.POST,
			        consumes=MediaType.APPLICATION_JSON_VALUE,
			        produces=MediaType.APPLICATION_JSON_VALUE)
	public Ingrediente create(@RequestBody Ingrediente ingrediente) {
		
		Ingrediente createdIngrediente = ingredienteRepository.save(ingrediente);
		
		return createdIngrediente;
	}
	
	
	@RequestMapping(value="/ingredientes/{id}",
					method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") int codigo) {
		
		ingredienteRepository.deleteById((long)codigo); 
		
		return "OK";
	}
	
	
	
}
