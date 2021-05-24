package com.devsuperior.auladto.dto;

import java.util.ArrayList;
import java.util.List;

public class ModelosDTO {

	private List<ItemDTO> modelos = new ArrayList<>();
	
	public ModelosDTO() {
	}

	public List<ItemDTO> getModelos() {
		return modelos;
	}

	public void setModelos(List<ItemDTO> modelos) {
		this.modelos = modelos;
	}
}
