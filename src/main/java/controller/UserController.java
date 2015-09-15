package controller;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.NewUserPageDTO;
import model.table.User;
import service.UserService;

@Controller
public class UserController {

	@Inject
	private UserService userService;
	
	@ModelAttribute("user")
	public NewUserPageDTO constructor() {
		return new NewUserPageDTO();
	}
	
	@RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
	public String addTestUser(Model model) {

		return "newUser";
	}
	
	@RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
	public String createNewUser(Model model, @ModelAttribute("user") NewUserPageDTO userDTO) {
		User user = new User();
		//user.setAge(userDTO.getAge());
		user.seteMail(userDTO.geteMail());
		user.setfName(userDTO.getFirstName());
		user.setlName(userDTO.getLastName());
		user.setPassword(userDTO.getUserPassword());
		user.setmName(userDTO.getMiddleName());
		
		String messageStutus = "user has been added";
		try{
			userService.addUser(user);
		}catch(Exception e){
			messageStutus = "Error, user hasn't been added";
		}
		
		model.addAttribute("userObject", messageStutus);
		
		return "newUser";
		
	}
}
	