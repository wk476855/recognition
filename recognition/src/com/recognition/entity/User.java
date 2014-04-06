package com.recognition.entity;

import java.util.List;

public class User {

	private int uid;
	private String phone;
	private String realName;
	private String modelPath;
	private List<Signature> signList;
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getModelPath() {
		return modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	public List<Signature> getSignList() {
		return signList;
	}

	public void setSignList(List<Signature> signList) {
		this.signList = signList;
	}
}
