package dao;

import java.util.List;

import model.table.User;

public interface UserDao extends ElementDao<User> {

	public List<User> findByLastName(String lastName);
	public User findByEmail(String email);
}