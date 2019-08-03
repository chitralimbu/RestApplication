package com.user.data;

import java.util.Arrays;
import java.util.List;

public class UserDao {
	List<User> users = Arrays.asList(
			new User(1, "Chitra", "Engineer"),
			new User(2, "Ashmita","Nurse"),
			new User(3, "Sam", "Sunday League")
			);
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUserByName(String name) {
		return users.stream()
					.filter(s -> s.getName().equalsIgnoreCase(name))
					.findAny()
					.orElse(new User(0, "No Name Found", "Job Not Found"));
	}
	
}
