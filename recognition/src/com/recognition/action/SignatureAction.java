package com.recognition.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.recognition.entity.Signature;
import com.recognition.service.SignatureService;

public class SignatureAction extends ActionSupport {

	private Signature sign;
	private String phone;
	private File voice;
	private String voiceFileName;
	
	private SignatureService signatureService;
	private String signRs;
	
	public String execute()
	{
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
			System.out.println("Signature Action : " + e.getMessage());
		}
		
		boolean flag = signatureService.sign(sign, realPath + "/" + voiceFileName, phone);
		return SUCCESS;
	}
	
	@JSON(serialize=false)
	public Signature getSign() {
		return sign;
	}

	public void setSign(Signature sign) {
		this.sign = sign;
	}

	@JSON(serialize=false)
	public SignatureService getSignatureService() {
		return signatureService;
	}

	public void setSignatureService(SignatureService signatureService) {
		this.signatureService = signatureService;
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

	@JSON(name="signRs")
	public String getSignRs() {
		return signRs;
	}

	public void setSignRs(String signRs) {
		this.signRs = signRs;
	}

	@JSON(serialize=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
