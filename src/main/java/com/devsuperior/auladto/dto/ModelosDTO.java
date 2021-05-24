package com.devsuperior.auladto.dto;

import java.util.ArrayList;
import java.util.List;

public class ModelosDTO {

	private List<ItemDTO> modelos = new ArrayList<>();
	
	private List<AnoDTO> anos = new ArrayList<>();
	
	public ModelosDTO() {
	}

	public List<ItemDTO> getModelos() {
		return modelos;
	}

	public void setModelos(List<ItemDTO> modelos) {
		this.modelos = modelos;
	}

	public List<AnoDTO> getAnos() {
		return anos;
	}

	public void setAnos(List<AnoDTO> anos) {
		this.anos = anos;
	}
}
