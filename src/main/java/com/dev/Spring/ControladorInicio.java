package com.dev.Spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Value("${index.saludo}")
	private String saludo;
	
	
	
	@GetMapping("/")
	public String inicio(Model model) {
		var mensaje = "Hola mundo con thymeleaf";
		var persona =  new Persona();
		var persona2 =  new Persona();
		persona.setNombre("Dev");
		persona.setApellido("DevA");
		persona.setEmail("dev@DevA.com");
		persona.setTelefono("1233321");
		
		persona2.setNombre("DevQA");
		persona2.setApellido("DevQA");
		persona2.setEmail("devQA@DevQA.com");
		persona2.setTelefono("1233321");
		
//		List<Persona> personas = new ArrayList<>();
//		
//		personas.add(persona);
//		personas.add(persona2);
		
		var personas = Arrays.asList(persona, persona2);
		
		log.info("Ejecutando el controlador Spring MVC");
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("saludo", saludo);
//		model.addAttribute("persona", persona);
		model.addAttribute("personas", personas);
		return "index";
	}

}
