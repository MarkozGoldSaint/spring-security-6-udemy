package com.security.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about_us")
public class AboutusController {

	@GetMapping
	public Map<String, String> getAboutUs(){
		// logica de negocio
		return Collections.singletonMap("msj", "about");
	}
	
}
