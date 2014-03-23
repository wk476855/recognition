package com.recognition.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.entity.User;

public class TestAjaxAction extends ActionSupport {

	private String jsonString;
	private User user;
	private List<String> dpartList = new ArrayList<String>();
	
	public String execute()
	{
		for(int i=0; i<5; i++)
		{
			dpartList.add(String.valueOf(i));
		}
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
	@JSON(name="depart")
	public List<String> getDpartList() {
		return dpartList;
	}

	public void setDpartList(List<String> dpartList) {
		this.dpartList = dpartList;
	}
	
}
