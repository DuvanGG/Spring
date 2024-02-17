package com.dev.Spring.web;

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
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		log.info("Ejecutando el controlador Spring MVC");
//		model.addAttribute("personas", personas);
		return "index";
	}

}
