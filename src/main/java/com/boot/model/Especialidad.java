package com.boot.model;

import java.util.Date;
import javax.persistence.*;


@Entity 
@Table(name="especialidades")
public class Especialidad {

	@Id
	@Column(name="especialidad_id")
	private long especialidad_id;
	
	@Column(name="descripcion")
	private String descripcion;

	public long getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(long especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
