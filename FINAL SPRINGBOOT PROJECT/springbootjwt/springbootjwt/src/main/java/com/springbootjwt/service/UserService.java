package com.springbootjwt.service;

import com.springbootjwt.dto.LoginDTO;
import com.springbootjwt.dto.UserDTO;

public interface UserService
{
	  //for user registration
	  void registerUser(UserDTO userDTO);
	  
	  //for user login
	  String login(LoginDTO loginDTO);
}
