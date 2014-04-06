package com.recognition.serviceImpl;

import java.util.List;

import com.recognition.dao.DepartmentDAO;
import com.recognition.dao.UserDAO;
import com.recognition.entity.Department;
import com.recognition.entity.User;
import com.recognition.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private DepartmentDAO departmentDAO;
	private UserDAO userDAO;
	
	@Override
	public boolean register(User user, String departName, String path) {
		// TODO Auto-generated method stub
		Department department = departmentDAO.getDepartmentByName(departName);
		List<User> ulist = userDAO.getUserByPhone(user.getPhone());
		if(department != null && ulist.size() == 0)
		{
			/*
			 * ÉùÎÆÊ¶±ð
			 */
			
			userDAO.addUser(user, department.getDepartName());
			return true;
		}		
		return false;
	}

	@Override
	public List<String> getAllDepartment() {
		// TODO Auto-generated method stub
		return departmentDAO.getAll();
	}

	public DepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}
	
	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
