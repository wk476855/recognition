package com.recognition.action;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.entity.Department;
import com.recognition.service.RegisterService;

public class GetDepartmentAction extends ActionSupport {

	private RegisterService registerService;
	private List<String> departList = null;
	
	public String execute()
	{
		departList = registerService.getAllDepartment();
//		System.out.println(departList.size());
		return SUCCESS;
	}
	
	@JSON(serialize=false)
	public RegisterService getregisterService() {
		return registerService;
	}
	
	public void setregisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	@JSON(name="departmentList")
	public List<String> getDepartList() {
		return departList;
	}

	public void setDepartList(List<String> departList) {
		this.departList = departList;
	}
}
