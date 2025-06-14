package com.plantilla.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Despedida {
	
	@GetMapping("/despedida")
	public String despedida(@RequestParam(name="destinatario",required=false,defaultValue="PRROS")String destino,
						   @RequestParam(name="mnsj",required=false,defaultValue="ACECTOO") String mensaje,Model model) {
		model.addAttribute("destinatario", destino);
		model.addAttribute("mnsj", mensaje);
		return "BYE";
	}

}
