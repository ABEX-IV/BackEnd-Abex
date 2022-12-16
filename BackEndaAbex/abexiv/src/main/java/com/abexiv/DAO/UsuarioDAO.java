package com.abexiv.DAO;

import javax.ejb.Stateless;

import com.abexiv.model.Usuario;
import com.abexiv.util.GenericoDAO;

@Stateless
public class UsuarioDAO extends GenericoDAO<Usuario, Long> {

	public UsuarioDAO() {
		super(Usuario.class);
	}

}
