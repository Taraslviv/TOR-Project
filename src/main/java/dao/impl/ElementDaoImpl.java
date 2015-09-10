package dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;

import org.springframework.transaction.annotation.Transactional;

import dao.ElementDao;

public class ElementDaoImpl<E> implements ElementDao<E> {

	private Class<E> elementClass;

	@PersistenceContext(name = "office")
	EntityManager entityManaget;
	
	public ElementDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;
	}

	@Transactional
	public void addElement(E element) {
		entityManaget.persist(element);
		entityManaget.flush();
	}

	@Transactional
	public E updateElement(E element) {
		return entityManaget.merge(element);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public E getElementById(Long elementId) {
		
		try{
		return (E) entityManaget
				.createQuery("select e from"+ elementClass.getSimpleName() +"e where e.id = :id")
				.setParameter("id", elementId).getSingleResult();
		} catch(NoResultException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<E> getAllElements() {
		return entityManaget.createQuery("select from"+elementClass.getSimpleName()).getResultList();
	}

	@Transactional
	public void deleteElement(E element) {
		entityManaget.remove(entityManaget.merge(element));
	}

}
