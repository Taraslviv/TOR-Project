package dao.impl;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.table.User;

@Repository
public class UserDaoImpl extends ElementDaoImpl<User>implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> findByLastName(String lastName) {
		try {
			return entityManaget.createNamedQuery(User.FIND_BY_NAME).
					setParameter("lastName", lastName).getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Transactional
	public User findByEmail(String email) {
		try{
			return (User) entityManaget.createNamedQuery(User.FINND_BY_EMAIL)
					.setParameter("email", email).getSingleResult();
		} catch(NoResultException ex) {
			return null;
		}
	}

}