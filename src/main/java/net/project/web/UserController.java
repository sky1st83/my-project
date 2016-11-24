package net.project.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.model.User;

@Controller
public class UserController {
	private ArrayList<User> users = new ArrayList<>();
	
	@GetMapping("/users")
	public String list(Model model){
		model.addAttribute("users", users);
		return "/user/list";
	}
	
	@PostMapping("/user/create")
	//@RequestMapping
	public String create(User user){
		System.out.println("user = " + user.toString());
		users.add(user);
		return "redirect:/users";
	}
	
	@GetMapping("/user/form")
	public String form(Model model){
		return"/user/form";
	}
	
}
