package com.plantilla.app.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantilla.app.dto.DatosPersonalesDTO;
import com.plantilla.app.entidad.DatosPersonalesEntity;
import com.plantilla.app.repository.DatosPersonalesRepository;
import com.plantilla.app.service.DatosPersonalesService;

@Service
public class DatosPersonalesImplement implements DatosPersonalesService {
	
	@Autowired
	private DatosPersonalesRepository repositorio;
	//SOBREESCRITURA
	@Override
	public void procesadatospersonales(DatosPersonalesDTO persona) {
		System.out.println("El nombre del CR7: "+persona.getNombre());
		System.out.println("El apellido es: "+persona.getApellido());
		System.out.println("La edad es: "+persona.getEdad());
		
		DatosPersonalesEntity dpe = new DatosPersonalesEntity();
		dpe.setNombre(persona.getNombre());
		dpe.setApellido(persona.getApellido());
		dpe.setEdad(persona.getEdad());
		dpe.setId(1);
		repositorio.save(dpe);

	}

}
