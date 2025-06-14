package com.plantilla.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class DatosPersonales {
	
	@GetMapping("/datos")
	public String datospersonales(@RequestParam(name="nombre", required=false, defaultValue="USUARIO") String nombre,
								@RequestParam(name="apellido", required=false, defaultValue="CIEN") String app, 
								@RequestParam(name="edad", required=false, defaultValue="01") int edad, Model model) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", app);
		model.addAttribute("edad", edad);
		return "Datos"; 
		
	}
}
