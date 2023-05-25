package com.example.dao;
import java.util.List;

import com.example.model.User;
public interface IUserDao 
{
	void saveUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	List<User> getAllUsers();

	User getUserById(long id);

}
