package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno4 {
	
	@GetMapping(value="alumno4")
	public String datos() {
		return "Nombre: Moisés<br> Carrera: Arquitectura<br> Matricula: 58917521<br> Cuatri: 5to";
	}

}