package com.dev.Spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.dev.Spring.domain.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Long>{
	

}
