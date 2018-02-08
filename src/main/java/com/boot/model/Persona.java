package com.boot.model;

import com.boot.model.*;

import java.util.Date;
import javax.persistence.*;


@Entity 
@Table(name="personas")
public class Persona {
	
	@Id
	@Column(name="persona_id")
	private long persona_id;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="e_mail")
	private String e_mail;
	
	@Column(name="telefono")
	private String telefono;
	
	 @Column(name="especialidad")
	private Especialidad especialidad;
	
	 @Column(name="obra_social")
	private  ObraSocial obra_social;
	 
	@Column(name="estado")
	private String estado;
	
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	
	@Column(name="tipo_persona")
	private String tipo_persona;

	public long getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(long persona_id) {
		this.persona_id = persona_id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getTipo_persona() {
		return tipo_persona;
	}

	public void setTipo_persona(String tipo_persona) {
		this.tipo_persona = tipo_persona;
	}

	@Override
	public String toString() {
		return "Persona [persona_id=" + persona_id + ", usuario=" + usuario + ", nombre=" + nombre + ", e_mail="
				+ e_mail + ", telefono=" + telefono + ", estado=" + estado + ", fecha_creacion=" + fecha_creacion
				+ ", tipo_persona=" + tipo_persona + "]";
	}
	
	
	
}

