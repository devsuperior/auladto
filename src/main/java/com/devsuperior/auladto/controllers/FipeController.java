package com.devsuperior.auladto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.auladto.dto.ModelosDTO;
import com.devsuperior.auladto.services.FipeService;

@RestController
@RequestMapping(value = "/marcas")
public class FipeController {

	@Autowired
	private FipeService service;
	
	@GetMapping(value = "/{marcaId}/modelos")
	public ResponseEntity<ModelosDTO> getModelos(@PathVariable Long marcaId) {
		ModelosDTO list = service.getModelosV1(marcaId);
		return ResponseEntity.ok().body(list);
	}
}
