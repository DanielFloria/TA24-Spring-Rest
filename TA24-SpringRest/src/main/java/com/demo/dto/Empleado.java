package com.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name="salario")
	private int salario;
	
	// Constructores
	public Empleado() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, String apellido, String trabajo, int salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	// Getters & setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", trabajo=" + trabajo
				+ ", salario=" + salario + "]";
	}
}
