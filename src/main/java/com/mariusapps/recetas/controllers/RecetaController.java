package com.mariusapps.recetas.controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariusapps.recetas.backend.integration.model.Receta;
import com.mariusapps.recetas.backend.integration.repositories.RecetaRepository;

@RestController
public class RecetaController {

	@Autowired
	private RecetaRepository recetaRepository;
	
	@RequestMapping("/recetas")
	public List<Receta> getAll(){
		return recetaRepository.findAll();
	}
	
	@RequestMapping("/recetas/{id}")
	public Receta getById(@PathVariable ("id") Long id){
		Optional<Receta> optionalReceta = recetaRepository.findById(id);
		return optionalReceta.isPresent() ? optionalReceta.get() : null;
	}
	
	@RequestMapping(value="recetas/image/{id}",
			method=RequestMethod.GET,
			produces=MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImageAsResource(@PathVariable ("id") String recetaImage) throws IOException{

		ClassPathResource imgFile = new ClassPathResource("/img/receta" + recetaImage + ".jpg");

		byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

		return ResponseEntity.ok().body(bytes);
	}
	
}
