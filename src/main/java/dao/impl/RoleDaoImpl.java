package dao.impl;

import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.RoleDao;
import model.table.Role;

@Repository
public class RoleDaoImpl extends ElementDaoImpl<Role>implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}

	@Transactional
	public Role findByRoleName(String roleName) {
		try {
			return (Role) entityManaget.createNamedQuery(Role.FIND_BY_ROLE_NAME).setParameter("roleName", roleName)
					.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

}
