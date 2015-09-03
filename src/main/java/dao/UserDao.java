package dao;

import model.table.User;

public class UserDao extends ElementDaoImpl<User>{
	public UserDao() {
		super(User.class);
	}
}