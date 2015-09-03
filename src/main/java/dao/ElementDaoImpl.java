package dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import util.HibernateUtil;

public class ElementDaoImpl<E> implements ElementDao<E> {

	private Class<E> elementClass;

	public ElementDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;
	}

	public void addElement(E element) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//Transaction transaction = (Transaction) session.beginTransaction();
			session.beginTransaction();
			session.save(element);
			//transaction.commit();
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
	}

	public void updateElement(E element) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Transaction transaction = (Transaction) session.beginTransaction();
			session.update(element);
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}	

	}

	public E getElementById(Long elementId) {
		Session session = null;
		E element = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			element = (E) session.load(elementClass, elementId);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}
		return element;
	}

	public List<E> getAllElements() {
		Session session = null;
		List<E> elements = new ArrayList<E>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			elements = session.createCriteria(elementClass).list();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}

		return elements;
	}

	public void deleteElement(E element) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			//Transaction transaction = (Transaction) session.beginTransaction();
			session.beginTransaction();
			session.delete(element);
			//transaction.commit();
			session.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen())) {
				session.close();
			}
		}


	}

}
