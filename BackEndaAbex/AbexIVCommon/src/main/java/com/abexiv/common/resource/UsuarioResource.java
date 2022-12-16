package com.abexiv.common.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.abexiv.common.DTO.UsuarioDTO;
import com.emprestimoRestAPICommon.DTO.EmprestimoDTO;


@Path("usuario")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface UsuarioResource {
	
	@GET
	public List<UsuarioDTO> todosUsuario();
	
	@GET
	@Path("{idEmprestimo}")
	public UsuarioDTO buscarPorId(@PathParam("idUsuario") Long idUsuario) ;
	
	@POST
	public Response cadastrar(UsuarioDTO usuarioDTO);
	
	@PUT
	@Path("{idEmprestimo}")
	public void atualizar(@PathParam("idUsuario") Long idUsuario, UsuarioDTO usuarioDTO);
	
	@DELETE
	@Path("{idEmprestimo}")
	public void excluir(@PathParam("idUsuario") Long idUsuario);
}
