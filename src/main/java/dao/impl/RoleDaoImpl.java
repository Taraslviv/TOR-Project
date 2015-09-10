package dao.impl;

import org.springframework.stereotype.Repository;

import dao.RoleDao;
import model.table.Role;

@Repository
public class RoleDaoImpl extends ElementDaoImpl<Role> implements RoleDao{

	public RoleDaoImpl() {
		super(Role.class);
	}

}
