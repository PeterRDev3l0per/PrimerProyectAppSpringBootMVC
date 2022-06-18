package com.rdev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdev.model.DM_Persona;
import com.rdev.model.DM_Usuario;

public interface IUsuarioRepo extends JpaRepository<DM_Usuario , Integer> {
	
	DM_Usuario findByNombre(String nombre);
}
