package com.fjavierlh.dao;

import org.springframework.data.repository.CrudRepository;

import com.fjavierlh.domain.User;

public interface IUserDao extends CrudRepository<User, Long> {

}
