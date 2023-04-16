package com.user.service.controller;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User, String>{
	//JpaRepository - Spring already supports Operations
	//If you need any custom method/query, feel free to add here.
}
