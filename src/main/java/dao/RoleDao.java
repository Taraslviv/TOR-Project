package dao;

import model.table.Role;

public interface RoleDao extends ElementDao<Role>{

	public Role findByRoleName(String roleName);
}