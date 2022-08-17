package com.demo.service;

import java.util.List;

import com.demo.dto.Empleado;

public interface IEmpleadoService {
	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado empleadoPorId(Long id);
	
	public List<Empleado> listarEmpleadosPorNombre(String nombre);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void borrarEmpleado(Long id);
}
