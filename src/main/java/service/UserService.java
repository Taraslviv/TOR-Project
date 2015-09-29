package service;

import java.util.List;

import model.table.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserInfo(Long userId);
	
	public User getInfoByEmail(String email);
	
	public void deleteUser(User user);
	
	public void addUser(User user);
	
	public boolean addNewUserRole(User user, String newUserRoleName);
	
	public void updateUserInfo(User user);
}

