package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDao;
import com.example.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User findById(Long id) {
		return userDao.findOne(id);
	}

	public User findByName(String name) {
		return userDao.findByName(name);
	}

	public void saveUser(User user) {
		userDao.save(user);
	}

	public void updateUser(User user) {
		saveUser(user);
	}

	public void deleteUserById(Long id) {
		userDao.delete(id);
	}

	public void deleteAllUsers() {
		userDao.deleteAll();
	}

	public List<User> findAllUsers() {
		return userDao.findAll();
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName()) != null;
	}

}
