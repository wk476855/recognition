package com.recognition.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.entity.User;
import com.recognition.service.RegisterService;

public class RegisterAction extends ActionSupport {

	private File voice;
	private String voiceFileName;
	
	private String departName;
	private String phone;
	private String realName;
	
	private String registerRs = null;
	private RegisterService registerService;	
	
	private User user;
	
	public String execute()
	{
		if(voice == null || departName == null || realName == null || phone == null)
		{
			registerRs = "register error, parameter is null";
			return SUCCESS;
		}
			
		String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
		File saveFile = new File(new File(realPath), voiceFileName);
		if(!saveFile.getParentFile().exists())
		{
			saveFile.getParentFile().mkdirs();
		}
		try{
			FileUtils.copyFile(voice, saveFile);
		}
		catch(Exception e){
			System.out.println("Register Action : " + e.getMessage());
		}
		
		user = new User();
		user.setPhone(phone);
		user.setRealName(realName);
		System.out.println(realPath);
		boolean flag = registerService.register(user, departName, realPath + "/" + voiceFileName);
		if(flag)
			registerRs = "register success";
		else
			registerRs = "register error, phone number has aready exist";
		return SUCCESS;
	}
	
	@JSON(serialize=false)
	public File getVoice() {
		return voice;
	}

	public void setVoice(File voice) {
		this.voice = voice;
	}

	@JSON(serialize=false)
	public String getVoiceFileName() {
		return voiceFileName;
	}

	public void setVoiceFileName(String voiceFileName) {
		this.voiceFileName = voiceFileName;
	}

	@JSON(serialize=false)
	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@JSON(serialize=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JSON(serialize=false)
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	@JSON(name="registerRs")
	public String getRegisterRs() {
		return registerRs;
	}

	public void setRegisterRs(String registerRs) {
		this.registerRs = registerRs;
	}

	@JSON(serialize=false)
	public RegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}
}
