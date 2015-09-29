package service;

import java.util.List;

import org.hibernate.Session;
import model.table.Role;

public interface RoleService {
	
	public List<Role> getAllRoles();
	
	public void deleteRole(Role role);
	
	public void addRole(String roleName, Double rate);
	
	public Role getRoleByName(String roleName);
}

