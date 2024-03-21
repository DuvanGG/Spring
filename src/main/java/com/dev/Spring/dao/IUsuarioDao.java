package com.dev.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.Spring.domain.Usuario;



public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	Usuario findByUsername(String username);

}
