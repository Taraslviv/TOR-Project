package service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.table.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	private UserDao userDou;

	@Transactional
	public List<User> getAllUsers() {
		return userDou.getAllElements();
	}

	@Transactional
	public User getUserInfo(Long userId) {
		return userDou.getElementById(userId);
	}

	@Transactional
	public void deleteUser(User user) {
		userDou.deleteElement(user);
	}

	@Transactional
	public void addUser(User user) {
		userDou.addElement(user);
	}

	@Transactional
	public User getInfoByEmail(String email) {
		
		return userDou.findByEmail(email);
	}

	@Transactional
	public boolean addNewUserRole(User user, String newUserRoleName) {
		
		return userDou.addUserRole(user, newUserRoleName);
	}

	@Override
	public void updateUserInfo(User user) {
		userDou.updateElement(user);
		
	}
	
}
