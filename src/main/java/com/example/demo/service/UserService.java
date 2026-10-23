package com.example.demo.service;

import com.example.demo.model.User;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final Map<UUID, User> users = new HashMap<>();
	
	//create User
	public User createUser(User user) {
		UUID id = UUID.randomUUID();
		user.setUUID(id);
		users.put(id, user);
		return user;
	}
	
	//Get all Users
	public List<User> getAllUsers(){
		return new ArrayList<>(users.values());
	}
	
	//Get one user
	public User getUserById(UUID id) {
		return users.get(id);
	}
	
	//update user
	public User updatedUser(UUID id,User updatedUSer) {
		if(!users.containsKey(id)) {
			return null;
		}
		updatedUSer.setUUID(id);
		users.put(id, updatedUSer);
		return updatedUSer;
	}
	
	//Delete user
	public boolean deleteUser(UUID id) {
		return users.remove(id) != null;
	}
}

