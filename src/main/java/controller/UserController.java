package controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.table.User;
import service.UserService;

@Controller
public class UserController {

	@Inject
	private UserService userService;
	
	@RequestMapping(value = "addTestUser", method = RequestMethod.GET )
	public String addTestUser(ModelAndView model) {
		User user = new User();
		user.setAge(22);
		user.seteMail("fsdf@f.com");
		user.setfName("Taras");
		user.setlName("last name");
		user.setPassword("somepass");
		user.setmName("midle name");
		
		String messageStutus = "user has been added";
		
		try{
			//userService.addUser(user);
		}catch(Exception e){
			messageStutus = "Error, user hasn't been added";
		}
		
		model.setViewName("newUser");
		model.addObject("userObject", messageStutus);
		return "newUser";
	}
}
	