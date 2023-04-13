package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Heroe;

public interface IHeroeDao extends CrudRepository<Heroe, Long>{

}
