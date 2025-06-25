package com.plantilla.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.plantilla.app.entidad.DatosPersonalesEntity;

public interface DatosPersonalesRepository extends CrudRepository<DatosPersonalesEntity, Integer> {

}
