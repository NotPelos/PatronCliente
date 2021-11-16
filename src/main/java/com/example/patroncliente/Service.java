package com.example.patroncliente;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
	
	Logger logger = LoggerFactory.getLogger(Service.class);
	
	RestTemplate restTemplate = new RestTemplate();
	String urlb = "http://localhost:8080/";
	String abrir = "abierto";
	String cerrar = "cerrado";
	String amedias = "medioabierto";
	
	public String gAbrir() {
		String url
		  = urlb+abrir;
		ResponseEntity<String> response
		  = restTemplate.getForEntity(URI.create(url), String.class);
		logger.info("Estado: "+abrir);
		return response.getBody();
	}
	
	public String gCerrar() {
		String url
		  = urlb+cerrar;
		ResponseEntity<String> response
		  = restTemplate.getForEntity(URI.create(url), String.class);
		logger.info("Estado: "+cerrar);
		return response.getBody();
	}
	
	public String gAmedias() {
		String url
		  = urlb+amedias;
		ResponseEntity<String> response
		  = restTemplate.getForEntity(URI.create(url), String.class);
		logger.info("Estado: "+amedias);
		return response.getBody();
	}
	

}
