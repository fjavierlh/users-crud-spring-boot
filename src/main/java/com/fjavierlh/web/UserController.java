package com.fjavierlh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fjavierlh.dao.IUserDao;
import com.fjavierlh.domain.User;

@Controller
public class UserController {
	
	@Autowired
	private IUserDao userDao;
	
	@GetMapping("/")
	public String index(Model model) {
		
		var users = userDao.findAll();
		
		model.addAttribute("users", users);
		
		return "index";
	}

}
