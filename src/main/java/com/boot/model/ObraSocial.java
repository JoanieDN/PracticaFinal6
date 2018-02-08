package com.boot.model;


import java.util.Date;
import javax.persistence.*;



@Entity 
@Table(name="obras_sociales")
public class ObraSocial {

	@Id
	@Column(name="obra_social_id")
	private long obra_social_id;
	
	@Column(name="nombre")
	private String nombre;
}
