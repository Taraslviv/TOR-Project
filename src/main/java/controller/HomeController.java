package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("hello", "Hello!");
		
		return "home";
	}
	
	@RequestMapping(value = {"/addUser"}, method = RequestMethod.GET)
	public String addUser(Model model) {
		
	
		return "home";
	}
}
