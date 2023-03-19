package com.example.Service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.Service.HeroeService;
import com.example.model.heroeModel;

public abstract class HeroeServiceimpl<HeroeRepository, HeroeModel> implements HeroeService{
	
	@Autowired
	@Qualifier("heroeRepository")
	private HeroeRepository heroeRepository;

	@Override
	public List<HeroeModel> listAllHeroe() {
		List<HeroeModel> heroeModel = new List<HeroeModel>();
		
		return heroeModel;
	}

	@Override
	public heroeModel findHroeById(int id) {
		return ((Object) heroeRepository).findById(id);
	}
	
}
