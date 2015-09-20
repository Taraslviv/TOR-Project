package controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.table.User;
import service.UserService;

@Controller
public class HomeController {

	@Inject
	UserService userService;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("hello", "Hello!");

		List<User> users = userService.getAllUsers();

		model.addAttribute("allUsersList", users);

		return "home";
	}

}
