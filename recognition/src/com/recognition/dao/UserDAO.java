package com.recognition.dao;

import java.util.List;

import com.recognition.entity.User;

public interface UserDAO {

	public int addUser(User user);
	public void addUser(User user, String departName);
	public List<User> getUserByPhone(String phone);
	public void update(User user);
}
