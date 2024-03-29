package com.mariusapps.recetas.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INGREDIENTES")
public class Ingrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String nombre;
	private String medida;
	
	public Ingrediente() {
		
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

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	@Override
	public String toString() {
		return "Ingrediente [id=" + id + ", nombre=" + nombre + ", medida=" + medida + "]";
	}

}
