package com.rdev;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rdev.model.DM_Usuario;
import com.rdev.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	void crearUsuario() {
		DM_Usuario us = new DM_Usuario();
		us.setId(2);
		us.setNombre("devpert");
		us.setClave(encoder.encode("122"));
		
		DM_Usuario retorno = repo.save(us);
		//validar si la clave que esta en la bd es la misma que se esta guardando aqui.
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
