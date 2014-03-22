package com.recognition.dao;

import java.util.List;

import com.recognition.entity.Administrator;

public interface AdministratorDAO {

	public List<Administrator> getAdminByLoginName(String loginName);
}
