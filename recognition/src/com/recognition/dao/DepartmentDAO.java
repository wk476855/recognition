package com.recognition.dao;

import java.util.List;
import com.recognition.entity.Department;

public interface DepartmentDAO {

	public List<String> getAll();
	public Department getDepartmentByName(String name);
	public boolean updateDepartment(Department department);
}
