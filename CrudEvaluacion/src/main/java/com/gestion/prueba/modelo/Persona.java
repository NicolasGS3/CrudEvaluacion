package com.gestion.prueba.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "persona")
public class Persona{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String documento;
	private String nombre;
	private String apellido;
	private LocalDate fcNacimiento;
	private String ciudad;
	private String email;
	private String telefono;
	private String ocupacion;
	
	public Persona() {
	}

	public Persona(int id, String documento, String nombre, String apellido, LocalDate fcNacimiento, String ciudad,
			String email, String telefono, String ocupacion) {
		super();
		this.id = id;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fcNacimiento = fcNacimiento;
		this.ciudad = ciudad;
		this.email = email;
		this.telefono = telefono;
		this.ocupacion = ocupacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFcNacimiento() {
		return fcNacimiento;
	}

	public void setFcNacimiento(LocalDate fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	


}
