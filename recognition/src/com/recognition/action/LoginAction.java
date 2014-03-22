package com.recognition.action;

import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.recognition.service.LoginService;

public class LoginAction extends ActionSupport {

	private LoginService loginService;
	private String loginName;
	private String password;
	private Map<String, Object> session = null;
	private String loginRs = null;
	
	public String execute()
	{		
		System.out.println(loginName);
		session = ActionContext.getContext().getSession();
		if(session.containsKey("admin"))
		{
			loginRs = "already login";
			return SUCCESS;
		}
		if(loginService.checkAdmin(loginName, password))
		{
			loginRs = "login success";
			return SUCCESS;
		}
		else
		{
			loginRs = "login error";
			return SUCCESS;
		}
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JSON(name="loginRs")
	public String getLoginRs() {
		return loginRs;
	}

	public void setLoginRs(String loginRs) {
		this.loginRs = loginRs;
	}

}
