package com.devsuperior.auladto.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.auladto.dto.ModelosDTO;

@Service
public class FipeService {

	@Autowired
	private RestTemplate restTemplate;
	
	public ModelosDTO getModelosV1(Long marcaId) {
		
		String path = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marcaId}/modelos";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("marcaId", marcaId.toString());
		
		ResponseEntity<ModelosDTO> result = restTemplate.getForEntity(path, ModelosDTO.class, uriVariables);
		return result.getBody();
	}
	
	public ModelosDTO getModelosV2(Long marcaId) {

		String path = "https://parallelum.com.br/fipe/api/v1/carros/marcas/{marcaId}/modelos";
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("marcaId", marcaId.toString());
		
		ParameterizedTypeReference<ModelosDTO> responseType = new ParameterizedTypeReference<ModelosDTO>() { };
		ResponseEntity<ModelosDTO> result = restTemplate.exchange(path, HttpMethod.GET, null, responseType, uriVariables);
		return result.getBody();
	}
}
