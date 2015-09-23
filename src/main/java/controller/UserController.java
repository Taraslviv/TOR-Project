package controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
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
	
	//insteed user was added
	private String messageStutus = "";
	
	@ModelAttribute("user")
	public NewUserPageDTO constructor() {
		return new NewUserPageDTO();
	}
	
	@RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
	public String addTestUser(Model model) {
		
		model.addAttribute("userObject", messageStutus);
		return "newUser";
	}
	
	@RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
	public String createNewUser(Model model, @ModelAttribute("user") NewUserPageDTO userDTO) {
		User user = new User();
		user.setAge(userDTO.getAge());
		user.seteMail(userDTO.geteMail());
		user.setfName(userDTO.getFirstName());
		user.setlName(userDTO.getLastName());
		user.setPassword(userDTO.getUserPassword());
		user.setmName(userDTO.getMiddleName());
		
		messageStutus = "user has been added";
		try{
			userService.addUser(user);
		}catch(Exception e){
			messageStutus = "Error, user hasn't been added";
		}
		
		return "redirect:toAddUser";	
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deleteUserOnEmail(HttpServletRequest request) {
		Long userId = Long.parseLong(request.getParameter("userId"));
 		
		User user = userService.getUserInfo(userId);
		
		userService.deleteUser(user);
		//System.out.println("delete = "+request.getParameter("email"));
		
		return "redirect:home";
	}
	
	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public String gotoUserEditor(Model model, HttpServletRequest request) {
		Long userId = Long.parseLong(request.getParameter("userId"));
		
		User user = userService.getUserInfo(userId);
		
		model.addAttribute("lastUserName", user.getlName());
		model.addAttribute("firstUserName", user.getfName());
		model.addAttribute("middleUserName", user.getmName());
		model.addAttribute("userAge", user.getAge());
		model.addAttribute("userEmail", user.geteMail());
		model.addAttribute("userRole", user.getRoles());
		
		return "editUser";
	}
	
	@RequestMapping(value = "/editUserInfo", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE)
			//headers={"Accept=application/json"})
			//consumes = "application/json")
			
	public String userEditor(HttpServletRequest request, @RequestBody NewUserPageDTO userDTO) {
		Long userId = Long.parseLong(request.getParameter("userId"));
		
		User user = userService.getUserInfo(userId);
		
		user.setlName(userDTO.getLastName());
		user.setfName(userDTO.getFirstName());
		user.setmName(userDTO.getMiddleName());
		user.setAge(userDTO.getAge());
		user.seteMail(userDTO.geteMail());
		user.setPassword(userDTO.getUserPassword());
		
		userService.addUser(user);
		
		System.out.println(userDTO.getLastName());
		return "redirect:/home";
	}
}
