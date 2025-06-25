package com.plantilla.app.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.plantilla.app.dto.DatosPersonalesDTO;
import com.plantilla.app.service.DatosPersonalesService;

@Controller()
public class DatosPersonalesController {
	
	//ADMIN ESE OBJETO E INYECTAR
	@Autowired
	private DatosPersonalesService datpersoi;
	
	//MOSTRAR LOS HTML
	@GetMapping("/datos")
	public String datospersonales(Model model) {
		model.addAttribute("objdatosperso", new DatosPersonalesDTO() );
		return "Datos"; 
	}
	
	//PROCESAR LA INFORMACIÓN DEL CONTROLADOR QUE MUESTRA LOS FORM
	@PostMapping("/procesarformulario")
	public String registraformulario(@ModelAttribute DatosPersonalesDTO persona) {
		System.out.println("El nombre es: "+persona.getNombre());
		System.out.println("El apellido es: "+persona.getApellido());
		System.out.println("La edad es: "+persona.getEdad());
		
		datpersoi.procesadatospersonales(persona);
		return "Saludo";
	}
	
	
	
}
