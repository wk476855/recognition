package com.recognition.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Signature {
	
	private int sid;
	private Timestamp getdate;
	private Timestamp putdate;
	private String process;
	private double longitude;
	private double latitude;
	private int identify;


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

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Timestamp getGetdate() {
		return getdate;
	}

	public void setGetdate(Timestamp getdate) {
		this.getdate = getdate;
	}

	public Timestamp getPutdate() {
		return putdate;
	}

	public void setPutdate(Timestamp putdate) {
		this.putdate = putdate;
	}
	

}
