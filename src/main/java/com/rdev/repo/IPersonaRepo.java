package com.rdev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdev.model.DM_Persona;

public interface IPersonaRepo extends JpaRepository<DM_Persona , Integer> {

}
