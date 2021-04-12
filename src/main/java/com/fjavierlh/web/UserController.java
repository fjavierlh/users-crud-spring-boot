package com.fjavierlh.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fjavierlh.dao.IUserDao;
import com.fjavierlh.domain.User;
import com.fjavierlh.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(Model model) {
		
		var users = userService.listUsers();
		model.addAttribute("users", users);
		
		return "index";
	}
	
	@GetMapping("/insert")
	public String insert(User user) {
		
		return "update";
	}
	
	@PostMapping("/save")
	public String save(@Valid User user, Errors errors) {
		
		if (errors.hasErrors()) return "update";
		
		this.userService.saveUser(user);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(User user, Model model) {
		user = this.userService.findUser(user);
		model.addAttribute("user", user);
		
		return "update";
	}
	
	@GetMapping("/delete")
	public String delete(User user) {
		this.userService.deleteUser(user);
		return "redirect:/";
	}

}
