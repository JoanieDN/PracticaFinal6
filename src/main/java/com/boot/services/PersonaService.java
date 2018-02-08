package com.boot.services;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.boot.model.*;
import com.boot.service.PersonaRepository;

import javax.transaction.*;

public class PersonaService {

	@Autowired
	private PersonaRepository p;
	
public Collection<Persona> MostrarTodo(){
		
		List<Persona> lb = new ArrayList<Persona>();
		
		for (Persona persona: p.findAll()) {	
		 
		}
		
		return lb;
		
	}

}
