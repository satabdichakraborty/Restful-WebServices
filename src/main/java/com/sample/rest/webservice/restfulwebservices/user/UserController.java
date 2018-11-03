package com.sample.rest.webservice.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	public ResponseEntity getUser(@RequestBody User user) {
		User savedUser = dao.save(user);
		//CREATED
		// /user/{id}
		URI locaion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(locaion).build();
	}

}
