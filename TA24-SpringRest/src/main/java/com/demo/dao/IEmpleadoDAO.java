package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	public List<Empleado> findByNombre(String nombre);
}
