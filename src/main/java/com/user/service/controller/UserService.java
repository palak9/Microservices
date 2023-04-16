package com.user.service.controller;

import java.util.List;


public interface UserService {

	//User operations
	//Create
	User saveUser(User user);	
	
	//Get All Users
	List<User> getAllUsers();
	
	//Get single user
	User getUser(String userId);
	
}
