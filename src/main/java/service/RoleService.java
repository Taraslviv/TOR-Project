package service;

import java.util.List;

import org.hibernate.Session;

import dao.DaoFactory;
import model.table.Role;
import util.HibernateUtil;

public class RoleService {

	public void addRole(Role role) {
		DaoFactory.getInstance().getRoleDao().addElement(role);
	}

	public void updateRole(Role role) {
		DaoFactory.getInstance().getRoleDao().updateElement(role);
	}

	public Role getRoleById(Long roleId) {
		return DaoFactory.getInstance().getRoleDao().getElementById(roleId);
	}

	public List<Role> getAllRoles() {
		return DaoFactory.getInstance().getRoleDao().getAllElements();
	}

	public void deleteRole(Role role) {
		DaoFactory.getInstance().getRoleDao().deleteElement(role);
	}

}
