package com.devsuperior.auladto.dto;

public class ItemDTO {

	private String nome;
	private Long codigo;
	
	public ItemDTO() {
	}

	public ItemDTO(String nome, Long codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
}
