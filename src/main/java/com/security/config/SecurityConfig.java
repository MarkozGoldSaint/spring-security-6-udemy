package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	/**
	 * Configuración de seguridad respecto a la protección de los Endpoints*/
	@Bean
	SecurityFilterChain secfilterchain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(
				auth ->
					auth		// Recursos o endpoints
					            // privados -> cualquiera de los 4 deben estar autenticados
						.requestMatchers("/loans","/balance","/accounts","/cards")
						.authenticated()
						// Cualquier recurso publico ajeno a los privados se puede acceder.
						.anyRequest().permitAll())
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults());
		return http.build();
	}

}
