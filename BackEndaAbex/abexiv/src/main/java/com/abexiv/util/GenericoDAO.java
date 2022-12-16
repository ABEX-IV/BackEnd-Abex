package com.abexiv.util;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public abstract class GenericoDAO<T, ID> {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Class<T> clazz;

	public GenericoDAO(Class<T> clazz) {
		this.clazz = clazz;
	}
	public void inserir(T entidade) {
		entityManager.persist(entidade);
	}
	public T buscarPorId(ID idEntidade) {
		return entityManager.find(clazz, idEntidade);
	}
	public List<T> buscarTodos(){
		return entityManager.createQuery(" select entidade from "+ clazz.getSimpleName() + " entidade ",clazz ).getResultList();
	}
	public void remover(ID idEntidade) {
		T claz = entityManager.find(clazz, idEntidade);
		entityManager.remove(claz);
	}
	public void update(T entidade) {
		entityManager.merge(entidade);
	}

}
