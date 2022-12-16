package com.abexiv.common.DTO;

public class UsuarioDTO {

	private Long idUsuarioDTO;

	private String email;

	private String nome;

	private String telefone;

	private Long nivelAcesso;

	public UsuarioDTO() {
		}


	public Long getIdUsuarioDTO() {
		return idUsuarioDTO;
	}


	public void setIdUsuarioDTO(Long idUsuarioDTO) {
		this.idUsuarioDTO = idUsuarioDTO;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(Long nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
}
