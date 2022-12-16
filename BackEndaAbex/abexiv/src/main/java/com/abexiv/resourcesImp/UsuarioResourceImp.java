package com.abexiv.resourcesImp;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

import com.abexiv.common.DTO.UsuarioDTO;
import com.abexiv.common.resource.UsuarioResource;
import com.abexiv.conversor.UsuarioConversor;
import com.abexiv.service.UsuarioService;

@ManagedBean
public class UsuarioResourceImp implements UsuarioResource {
	
	@Inject
	UsuarioService usuarioService;
	@Inject
	UsuarioConversor usuarioConversor;

	@Override
	public List<UsuarioDTO> todosUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioDTO buscarPorId(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void atualizar(Long idUsuario, UsuarioDTO usuarioDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Response cadastrar(UsuarioDTO usuarioDTO) {
		usuarioService.inserir(usuarioConversor.conversorParaUsuario(usuarioDTO));
		return null;
	}

}
