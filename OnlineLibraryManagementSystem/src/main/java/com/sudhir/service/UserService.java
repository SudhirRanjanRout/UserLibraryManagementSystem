package com.sudhir.service;

import com.sudhir.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}