package com.fjavierlh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
