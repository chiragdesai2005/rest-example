package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.model.User;
@Service("userService")
@Transactional
public interface UserService {
	User findById(Long id);
	 
    User findByName(String name);
 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);
}
