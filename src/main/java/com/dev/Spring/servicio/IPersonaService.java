package com.dev.Spring.servicio;

import java.util.List;

import com.dev.Spring.domain.Persona;

public interface IPersonaService {
	
	public List<Persona> listarPersonas();
	
	public void guardar(Persona persona);
	
	public void eliminar(Persona persona);
	
	public Persona encontrarPersona(Persona persona);

}
