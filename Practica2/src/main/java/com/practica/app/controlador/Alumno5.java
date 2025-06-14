package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno5 {
	
	@GetMapping("/alumno/{nombre}")
	public String datos(@PathVariable String nombre) {
		if(nombre.equalsIgnoreCase("cr7")) {
			return "Nombre: Cristiano Ronaldo SIIIUUUUU";
		} else if(nombre.equalsIgnoreCase("messi")) {
			return "que mira bobo, pechofríooooo. PEEEESSIIIII";
		} else {
			return "Alumno no encontrado";
		}
	}
}