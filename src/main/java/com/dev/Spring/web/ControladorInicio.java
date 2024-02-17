package com.dev.Spring.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dev.Spring.domain.Persona;
import com.dev.Spring.servicio.IPersonaService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ControladorInicio {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		var personas = personaService.listarPersonas();
		
		log.info("Ejecutando el controlador Spring MVC");
		model.addAttribute("personas", personas);
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		
		return "modificar";
		
	}
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		
		personaService.guardar(persona);
		
		return "redirect:/";
		
	}
}
