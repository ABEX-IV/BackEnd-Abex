package com.emprestimo.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.abexiv.resourcesImp.UsuarioResourceImp;
import com.emprestimo.resources.EmprestimoResourceImp;
import com.emprestimo.resources.FuncionarioResourceImp;
import com.emprestimo.resources.ParcelasResourceImp;

@ApplicationPath("api/rest/v1")
public class ApplicationConfig extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> listaClasses = new HashSet<>();
		listaClasses.addAll(getListaResources());
		return listaClasses;
	}
	
	private Set<Class<?>> getListaResources() {
		Set<Class<?>> listaResources = new HashSet<>();
		listaResources.add(UsuarioResourceImp.class);
		return listaResources;
	}
	
}
