package com.bolsadeideas.springboot.backend.apirest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Heroe;
import com.bolsadeideas.springboot.backend.apirest.models.services.IHeroeService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class HeroeRestController {

	@Autowired
	private IHeroeService heroeService;

	@GetMapping("/heroe")
	public List<Heroe> index() {
		return heroeService.findAll();
	}
	@GetMapping("/heroe/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Heroe show(@PathVariable Long id){
		return heroeService.findById(id);
		
	}
	
	@PostMapping("/heroe")
	@ResponseStatus(HttpStatus.CREATED)
	public Heroe create(@RequestBody Heroe heroe) {
		
		return heroeService.save(heroe);
	}
	
	@PutMapping("/heroe/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Heroe update(@RequestBody Heroe heroe, long id) {
		Heroe heroeActual = heroeService.findById(id);
		
		heroeActual.setEmail(heroe.getEmail());
		heroeActual.setFranquicia(heroe.getFranquicia());
		heroeActual.setNombre(heroe.getNombre());
		return heroeService.save(heroeActual);
	}
	@DeleteMapping("/heroe/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable long id) {
		heroeService.delete(id);
	}

}
