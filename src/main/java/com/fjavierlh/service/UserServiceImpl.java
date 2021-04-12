package com.fjavierlh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjavierlh.dao.IUserDao;
import com.fjavierlh.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private IUserDao iUserDao;

	@Override
	public List<User> listUsers() {
		return (List<User>) this.iUserDao.findAll();
	}

	@Override
	public void saveUser(User user) {
		this.iUserDao.save(user);
	}

	@Override
	public void deleteUser(User user) {
		this.iUserDao.delete(user);
	}

	@Override
	public User findUser(User user) {
		return this.iUserDao.findById(user.getId()).orElse(null);
	}

}
