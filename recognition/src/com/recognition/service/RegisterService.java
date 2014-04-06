package com.recognition.service;

import java.util.List;

import com.recognition.entity.User;

public interface RegisterService {

	public boolean register(User user, String departName, String path);
	public List<String> getAllDepartment();
	
}
