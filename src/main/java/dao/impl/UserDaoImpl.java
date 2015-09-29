package dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.table.Role;
import model.table.User;
import service.RoleService;

@Repository
public class UserDaoImpl extends ElementDaoImpl<User>implements UserDao {

	@Inject
	RoleService roleService;

	public UserDaoImpl() {
		super(User.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> findByLastName(String lastName) {
		try {
			return entityManaget.createNamedQuery(User.FIND_BY_NAME).setParameter("lastName", lastName).getResultList();
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Transactional
	public User findByEmail(String email) {
		try {
			return (User) entityManaget.createNamedQuery(User.FINND_BY_EMAIL).setParameter("mail", email)
					.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Transactional
	public boolean addUserRole(User user, String role) {
		Role newUserRole = roleService.getRoleByName(role);
		ArrayList<Role> userRoles = (ArrayList<Role>) user.getRoles();
		Boolean result = false;

		if (newUserRole != null) {
			if (!userRoles.contains(newUserRole)) {
				userRoles.add(newUserRole);
				
				user.setRoles(userRoles);
				super.addElement(user);
				
				result = true;
			} 
		}
		
		return result;
	}

}