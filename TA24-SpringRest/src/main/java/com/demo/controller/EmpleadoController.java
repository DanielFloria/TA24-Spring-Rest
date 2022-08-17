package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.dto.Empleado;
import com.demo.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoPorNombre(@PathVariable(name="nombre") String nombre) {
		return empleadoServiceImpl.listarEmpleadosPorNombre(nombre);
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoPorId(@PathVariable(name="id") Long id) {
		Empleado empleadoPorId = new Empleado();
		empleadoPorId = empleadoServiceImpl.empleadoPorId(id);
		
		System.out.println("Empleado por ID: " + empleadoPorId);
		
		return empleadoPorId;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empleado) {
		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();
		
		empleadoSeleccionado = empleadoServiceImpl.empleadoPorId(id);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellido(empleado.getApellido());
		empleadoSeleccionado.setTrabajo(empleado.getTrabajo());
		empleadoSeleccionado.setSalario(empleado.getSalario());
		
		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);
		
		System.out.println("El empleado actualizado es: " + empleadoActualizado);
		
		return empleadoActualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void borrarEmpleado(@PathVariable(name="id") Long id) {
		empleadoServiceImpl.borrarEmpleado(id);
	}
}	