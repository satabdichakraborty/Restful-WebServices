package com.sample.rest.webservice.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public UserDaoService() {
	}

	private static List<User> users = new ArrayList<>();
	

	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Boston", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	private static int usersCount = 3;

	public List<User> findAll() {
		return users;
	}

	/*public User save(String name) {
		User u = new User(name);
		u.setId(++usersCount);
		u.setBirthDate(new Date());
		users.add(u);
		return u;
	}*/
	
	public User save(User u) {
		u.setId(++usersCount);
		u.setBirthDate(new Date());
		users.add(u);
		return u;
	}
	

	public User findUser(int id) {
		User user = null;
		for (User u : users) {
			if (u.getId() == id) {
				user = u;
			}
		}
		return user;
	}

}
