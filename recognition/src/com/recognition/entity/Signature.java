package com.recognition.entity;

import java.sql.Date;

public class Signature {
	
	private int uid;
	private Date getdate;
	private Date putdate;
	private String process;
	private int identify;
	
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public Date getGetdate() {
		return getdate;
	}
	
	public void setGetdate(Date getdate) {
		this.getdate = getdate;
	}

	public Date getPutdate() {
		return putdate;
	}

	public void setPutdate(Date putdate) {
		this.putdate = putdate;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public int getIdentify() {
		return identify;
	}

	public void setIdentify(int identify) {
		this.identify = identify;
	}
	

}
