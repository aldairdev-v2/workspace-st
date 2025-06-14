package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiPrimerControlador {
	
	@GetMapping(value="saludo")
	public String saludo() {
		return "Hola mundo!!";
	}

}
