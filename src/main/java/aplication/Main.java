package aplication;

import java.util.ArrayList;
import java.util.List;

import dao.DaoFactory;
import model.table.Role;
import model.table.User;
import service.RoleService;
import service.UserService;

public class Main {

	public static void main(String[] args) {
		User currentUser = new User();
		Role currentRole = new Role();
		
		DaoFactory factory = DaoFactory.getInstance();
		UserService userService = new UserService();
		RoleService roleService = new RoleService();
		
		List<User> usersInRole = new ArrayList<User>();
		List<Role> rolesInUser = new ArrayList<Role>();
		
		//role
		currentRole.setRoleName("buchhalter");
		currentRole.setRoleRate(3.0);
		
		//user
		currentUser.setPassword("12345");
		currentUser.setAge(23);
		currentUser.seteMail("bobroot@mail.ua");
		currentUser.setfName("Bob");
		currentUser.setlName("Marley");
		currentUser.setmName("Gary");
		
		//add in list 
		//usersInRole.add(currentUser);// to role
		//rolesInUser.add(currentRole);// to user
		
		//add to list in table
		//currentRole.setUsers(usersInRole); // add user list to role
		//currentUser.setRoles(rolesInUser); // add role list to user
		
		//List<User> users = userService.getAllUsers();
		//List<Role> roles = roleService.getAllRoles();
		
		//for(Role r : roles) {
		//	roleService.deleteRole(r);
		//}
		
		//roleService.deleteRole(currentRole);
		
		//userService.addUser(currentUser);
		roleService.addRole(currentRole);
		System.out.println("Finish");
	}

}
