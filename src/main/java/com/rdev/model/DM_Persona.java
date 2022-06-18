package com.rdev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//entidades son las tablas
@Entity
public class DM_Persona {
	
	@Id
	private int IdPersona;
	
	@Column(name="nombre", length = 50)
	private String nombre;
	
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
