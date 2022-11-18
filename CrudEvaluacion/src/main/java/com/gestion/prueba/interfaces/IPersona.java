package com.gestion.prueba.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gestion.prueba.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
