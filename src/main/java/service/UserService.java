package service;

import java.util.List;

import model.table.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserInfo(Long userId);
	
	public User findByEmail(String email);
	
	public void deleteUser(User user);
	
	public void addUser(User user);
}

