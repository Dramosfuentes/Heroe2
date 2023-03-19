package com.example.model;

public class heroeModel {
	private int id;
	private String nombre;
	private String franquicia;
	
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = id;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFranquicia() {
		return franquicia;
	}
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
	
	
	
	public heroeModel(int id, String nombre, String franquicia) {
		
		super();
		this.id = id;
		this.nombre = nombre;
		this.franquicia = franquicia;
	}
	
	public heroeModel() {}
	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", nombre=" + nombre + ", franquicia=" + franquicia + "]";
	}
	
}