package com.recognition.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.recognition.dao.SignatureDAO;
import com.recognition.dao.UserDAO;
import com.recognition.entity.Signature;
import com.recognition.entity.User;
import com.recognition.service.SignatureService;
import com.recognition.util.PushMessage;

public class SignatureServiceImpl implements SignatureService {

	private SignatureDAO signatureDAO;
	private UserDAO userDAO; 
	
	@Override
	public boolean sign(Signature sign, String path, String phone) {
		// TODO Auto-generated method stub
		/*
		 * 语音识别 
		 */
		signatureDAO.updateSignature(sign);
		return true;
	}

	@Override
	public boolean request(String phone) {
		// TODO Auto-generated method stub
		List<User> userList = userDAO.getUserByPhone(phone);
		if(userList.size() > 0)
		{
			System.out.println(userList.size());
			User user = userList.get(0);
			List<Signature> signList = user.getSignList();
			Signature sign = new Signature();
			sign.setIdentify(0); // 设置签到标志
			sign.setGetdate(new Timestamp(new Date().getTime()));
			signatureDAO.addSignature(sign, user.getUid());
			/*
			 * 百度云推送
			 */
			if(PushMessage.push())
				return true;
			else
				return false;
		}
		return false;
	}
	
	public SignatureDAO getSignatureDAO() {
		return signatureDAO;
	}
	
	public void setSignatureDAO(SignatureDAO signatureDAO) {
		this.signatureDAO = signatureDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
