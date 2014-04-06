package com.recognition.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.recognition.dao.DepartmentDAO;
import com.recognition.entity.Department;

public class DepartmentDAOImpl extends HibernateDaoSupport implements DepartmentDAO {

	private HibernateTemplate ht = null;
	
	@Override
	public List<String> getAll() {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		String sql = "select departName from Department";
		List<String> rs = (List<String>)ht.find(sql);
		return rs;
	}
	
	@Override
	public Department getDepartmentByName(String name) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		Department department = ht.get(Department.class, name);
//		System.out.println(department.getUserList().size());
		return department;
	}
	
	@Override
	public boolean updateDepartment(Department department) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
//		System.out.println(department.getUserList().size());
		ht.update(department);
		return true;
	}

}
