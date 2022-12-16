package com.abexiv.conversor;

import javax.ejb.Stateless;

import com.abexiv.common.DTO.UsuarioDTO;
import com.abexiv.model.Usuario;

@Stateless
public class UsuarioConversor {
	
	//converte json para entidade
	
	public Usuario conversorParaUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(usuarioDTO.getIdUsuarioDTO());
		usuario.setNome(usuarioDTO.getNome());
		usuario.setEmail(usuarioDTO.getEmail());
		return usuario;
	}
	
	//converte entidade para json 

	
	public UsuarioDTO conversorParaUsuarioDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setIdUsuarioDTO(usuario.getIdUsuario());
		usuarioDTO.setNome(usuario.getNome());
		usuarioDTO.setEmail(usuario.getEmail());
		return usuarioDTO;
	}

}
