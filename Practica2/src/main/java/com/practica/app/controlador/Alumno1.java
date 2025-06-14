package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno1 {
	
	@GetMapping(value="alumno1")
	public String datos() {
		return "Nombre: Cristiano Ronaldo<br> Carrera: Ing. Sistemas<br> Matricula: 58479621<br> Cuatri: 9no";
	}

}
