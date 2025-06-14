package com.plantilla.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Bienvenida {
	
	@GetMapping("/saludo")
	public String saludo(@RequestParam(name="nombre",required=false,defaultValue="hola")String nombre,
						@RequestParam(name="apellidos",required=false,defaultValue="mundo") String app,Model model) {
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellidos", app);
		return "Saludo";
	}

}
