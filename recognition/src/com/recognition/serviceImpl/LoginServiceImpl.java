package com.recognition.serviceImpl;

import java.util.List;

import com.recognition.dao.AdministratorDAO;
import com.recognition.entity.Administrator;
import com.recognition.service.LoginService;

public class LoginServiceImpl implements LoginService{

	private AdministratorDAO adminDAO;
	@Override
	public boolean checkAdmin(String loginName, String password) {
		// TODO Auto-generated method stub
		List<Administrator> adminList = adminDAO.getAdminByLoginName(loginName);
		if(adminList != null)
		{
			if(adminList.size() == 1 && adminList.get(0).getPassword().equals(password))
				return true;
			return false;
		}
		return false;
	}
	
	public AdministratorDAO getAdminDAO() {
		return adminDAO;
	}
	 
	public void setAdminDAO(AdministratorDAO adminDAO) {
		this.adminDAO = adminDAO;
	}
	

}
