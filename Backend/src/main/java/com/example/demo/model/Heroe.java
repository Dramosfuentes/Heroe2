package com.example.demo.model;

import java.io.Serializable;



public class Heroe implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String Nom;
	private String franquicia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getFranquicia() {
		return franquicia;
	}
	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}
}