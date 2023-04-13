package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Heroe;

public interface IHeroeService {
	
	public List<Heroe> findAll();
	
	public Heroe findById(long id);
	
	public Heroe save(Heroe heroe);
	
	public void delete (long id);

}
