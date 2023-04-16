package com.user.service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user) ;
	}

	@Override
	public List<User> getAllUsers() {		
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepository.findById(userId).orElseThrow();
	}
}
