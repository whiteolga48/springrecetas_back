package com.mariusapps.recetas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariusapps.recetas.backend.integration.model.Dificultad;

@RestController
public class DificultadController {

	@RequestMapping("/dificultad")
	public List<String> getDificultad(){
		
		List<String> values = new ArrayList<>();
		
		for (Dificultad dificultad: Dificultad.values()) {
			values.add(dificultad.toString());
		}
		
		return values;
	}
	
}
