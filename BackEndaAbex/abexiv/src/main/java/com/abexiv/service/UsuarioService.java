package com.abexiv.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.abexiv.DAO.UsuarioDAO;
import com.abexiv.model.Usuario;

@Stateless
public class UsuarioService {
	
	@Inject
	UsuarioDAO usuarioDAO;
	
	public void inserir(Usuario usuario) {
		usuarioDAO.inserir(usuario);
	}

}
