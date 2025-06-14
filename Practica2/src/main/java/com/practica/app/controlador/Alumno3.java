package com.practica.app.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Alumno3 {
	
	@GetMapping(value="alumno3")
	public String datos() {
		return "Nombre: Laura<br> Carrera: Ing. Info administrativa<br> Matricula: 58402361<br> Cuatri: 6to";
	}

}