package com.mariusapps.recetas.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RECETAS")
public class Receta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String nombre;
	
	public Receta() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
