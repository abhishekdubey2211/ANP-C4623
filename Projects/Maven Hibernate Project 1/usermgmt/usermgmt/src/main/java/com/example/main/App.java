package com.example.main;

import com.example.dao.*;
import com.example.model.*;
public class App {
  public static void main(String[] args) 
  {
	  	UserDao dao = new UserDao();	    
	    // Create a new user entity
	    User user = new User();
	    user.setName("John jha");
	    user.setEmail("jhon@gmail.com");
	    user.setContact(558459545);
	    dao.saveUser(user);
	    
//	    user.setName("anju");
//	    dao.updateUser(user);
	    
	    dao.deleteUser(2);

	    
  }
}