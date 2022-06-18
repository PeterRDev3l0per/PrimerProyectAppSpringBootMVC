package com.rdev.rest;

import java.util.List;

import org.hibernate.annotations.SQLDeleteAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdev.model.DM_Persona;
import com.rdev.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<DM_Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody DM_Persona per){
		//convertimos el json a objeto java con requestoBody
		//lanzamos desde postman la peticion e insertamos con JPA-Hibernate el json recibido.
		repo.save(per);
	}
	
	@PutMapping
	public void modificar(@RequestBody DM_Persona per){
		repo.save(per);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}
}
