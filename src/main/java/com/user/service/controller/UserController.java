package com.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/")
	public String homePage() {
		return "Welcome!";
	}
	
	//Create
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	//Get Single User
	@RequestMapping("/users/{id}")
	public User getUserById(@PathVariable String id) {
		return userService.getUser(id);
	}	
	
	
	//Get All Users
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
