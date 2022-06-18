package com.rdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rdev.model.DM_Persona;
import com.rdev.repo.IPersonaRepo;

@Controller
public class DemoController {

	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/InsertarG")
	public String InsertarG(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
		//logica
		DM_Persona p = new DM_Persona();
		p.setIdPersona(3);
		p.setNombre("Peter");
		repo.save(p);
		
		model.addAttribute("name",name);
		//regresa el nombre de la pagina a navegar
		return "landing";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		//logica
		model.addAttribute("personas",repo.findAll());
		return "landing";
	}
}
