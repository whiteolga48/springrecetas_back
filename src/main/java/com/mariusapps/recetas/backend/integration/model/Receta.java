package com.mariusapps.recetas.backend.integration.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="RECETAS")
public class Receta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String nombre;
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "RECETAS_INGREDIENTES",
	        joinColumns = @JoinColumn(name = "ID_RECETA"),
	        inverseJoinColumns = @JoinColumn(name = "ID_INGREDIENTE")
	    )
	private List<Ingrediente> ingredientes;
	
	@Transient
	private String foto;
	
	@Transient
	private CategoriaReceta categoriaReceta;
	
	@Transient
	private int tiempoDeCoccion;
	
	@Transient
	private int tiempoDePreparacion;
	
	@Transient
	private Temperatura temperatura;
	
	@Transient
	private Dificultad dificultad;
    
	@Transient
	private double coste;
    
	@Transient
	private List<String> pasos;
	
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

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public CategoriaReceta getCategoriaReceta() {
		return categoriaReceta;
	}

	public void setCategoriaReceta(CategoriaReceta categoriaReceta) {
		this.categoriaReceta = categoriaReceta;
	}

	public int getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}

	public void setTiempoDeCoccion(int tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}

	public int getTiempoDePreparacion() {
		return tiempoDePreparacion;
	}

	public void setTiempoDePreparacion(int tiempoDePreparacion) {
		this.tiempoDePreparacion = tiempoDePreparacion;
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public List<String> getPasos() {
		return pasos;
	}

	public void setPasos(List<String> pasos) {
		this.pasos = pasos;
	}

	@Override
	public String toString() {
		return "Receta [id=" + id + ", nombre=" + nombre + ", ingredientes=" + ingredientes + ", foto=" + foto
				+ ", categoriaReceta=" + categoriaReceta + ", tiempoDeCoccion=" + tiempoDeCoccion
				+ ", tiempoDePreparacion=" + tiempoDePreparacion + ", temperatura=" + temperatura + ", dificultad="
				+ dificultad + ", coste=" + coste + ", pasos=" + pasos + "]";
	}

}
