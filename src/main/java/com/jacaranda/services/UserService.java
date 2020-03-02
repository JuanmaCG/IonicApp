package com.jacaranda.services;

import java.util.List;


import com.jacaranda.dto.UserDTO;
import com.jacaranda.entities.User;

public interface UserService {

	
	User findByUsername(String username);
	List<UserDTO> findAll();
	User addUser(UserDTO user);
	void deleteByUsername(String username);
	void updateUserByUsername(String username, UserDTO user);
}
