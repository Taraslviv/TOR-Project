package service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.RoleDao;
import model.table.Role;
import service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Inject
	private RoleDao roleDao;
	
	@Transactional
	public List<Role> getAllRoles() {
		return roleDao.getAllElements();
	}

	@Transactional
	public void deleteRole(Role role) {
		roleDao.deleteElement(role);
	}

	@Transactional
	public void addRole(String roleName, Double rate) {
		Role role = new Role();
		role.setRoleName(roleName);
		role.setRoleRate(rate);
		
		roleDao.addElement(role);
	}

	@Transactional
	public Role getRoleByName(String roleName) {
		return roleDao.findByRoleName(roleName);
	}

}
