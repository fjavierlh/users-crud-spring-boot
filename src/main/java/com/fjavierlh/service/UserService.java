package com.fjavierlh.service;

import java.util.List;

import com.fjavierlh.domain.User;

public interface UserService {
	
	public List<User> listUsers();
	
	public void saveUser(User user);
	
	public void deleteUser(User user);
	
	public User findUser(User user);

}
