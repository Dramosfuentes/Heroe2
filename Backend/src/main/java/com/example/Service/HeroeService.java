package com.example.Service;

import java.util.List;

import com.example.model.heroeModel;

public interface HeroeService<HeroeModel> {
	public abstract heroeModel findHeroeById(int id);
	List<HeroeModel> listAllHeroe();
	HeroeModel findHroeById(int id);
	
}