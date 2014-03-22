package com.recognition.action;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.entity.User;

public class TestAjaxAction extends ActionSupport {

	private String jsonString;
	private User user;
	
	public String execute()
	{
		setJsonString("run successfully!");
		return SUCCESS;
	}

	@JSON(name="jsonString")
	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
