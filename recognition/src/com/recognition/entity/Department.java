package com.recognition.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable{

	private String departName;
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
}
