package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno2 {
	
	@GetMapping("/alumno2")
	public String datos() {
		return "Nombre: Noemi Bastida<br> Carrera: Ing. Civil<br> Matricula: 58465471<br> Cuatri: 8vo";
	}

}