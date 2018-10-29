package com.sample.rest.webservice.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserDaoService dao;

	public UserController() {
	}

	@GetMapping("/users/{id}")
	public User findUser(@PathVariable String id) {
		return dao.findUser(Integer.parseInt(id));
	}
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return dao.findAll();
	}
	
	@PostMapping("/users")
	public User getUser(@RequestBody User user) {
		User savedUser = dao.save(user);
		return savedUser;
	}


}
