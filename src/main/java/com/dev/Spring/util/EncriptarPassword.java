package com.dev.Spring.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
	
	public static void main(String[] args) {
		// Clase de Spring para la encripcion
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		var password = "123";
		
		System.out.println("Password encriptado: " + encriptarPassword(password));
		
		
	}
	
	public static String encriptarPassword(String password) {
		// Clase de Spring para la encripcion
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		return encoder.encode(password);
		
	}

}
