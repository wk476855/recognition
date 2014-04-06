package com.recognition.action;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.service.SignatureService;

public class RequestSignatureAction extends ActionSupport {
	
	private SignatureService signatureService;
	private String phone;
	
	private String requestRs;
	
	public String execute()
	{
		boolean flag = signatureService.request(phone);
		if(flag)
			requestRs = "request success";
		else
			requestRs = "request error";
		return SUCCESS;
	}

	@JSON(serialize=false)
	public SignatureService getSignatureService() {
		return signatureService;
	}

	public void setSignatureService(SignatureService signatureService) {
		this.signatureService = signatureService;
	}

	@JSON(serialize=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JSON(name="requestRs")
	public String getRequestRs() {
		return requestRs;
	}

	public void setRequestRs(String requestRs) {
		this.requestRs = requestRs;
	}
}
