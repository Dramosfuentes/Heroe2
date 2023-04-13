package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IHeroeDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Heroe;

@Service
public class HeroeServiceImpl implements IHeroeService{

	@Autowired
	private IHeroeDao heroeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Heroe> findAll() {
		return (List<Heroe>) heroeDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Heroe findById(long id) {
		return heroeDao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Heroe save(Heroe heroe){
		return heroeDao.save(heroe);
	}
	@Override
	@Transactional
	public void delete (long id) {
		heroeDao.deleteById(id);
	}

}
