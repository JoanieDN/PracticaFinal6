package com.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.model.Persona;


public interface PersonaRepository extends CrudRepository<Persona, Long>  {

}
