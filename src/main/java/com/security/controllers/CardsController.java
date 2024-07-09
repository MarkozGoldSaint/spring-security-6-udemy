package com.security.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class CardsController {
	
	
	@GetMapping
	public Map<String, String> getCards(){
		// logica de negocio
		return Collections.singletonMap("msj", "cards");
	}

}
