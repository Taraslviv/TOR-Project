package service;

import java.util.List;

import org.hibernate.Session;

import dao.DaoFactory;
import model.table.Role;
import model.table.User;
import util.HibernateUtil;

public class UserService {
	
	public void addUser(User user) {
		DaoFactory.getInstance().getUserDao().addElement(user);
	}
	
	public void updateUser(User user) {
		DaoFactory.getInstance().getUserDao()
		.updateElement(user);
	}
	
	public User getUserById(Long userId) {
		return DaoFactory.getInstance().getUserDao()
				.getElementById(userId);
	}
	
	public List<User> getAllUsers() {
		return DaoFactory.getInstance().getUserDao()
				.getAllElements();
	}
	
	public void deleteUser(User user) {
		DaoFactory.getInstance().getUserDao()
		.deleteElement(user);
	}
	
}
