package com.recognition.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.recognition.dao.AdministratorDAO;
import com.recognition.entity.Administrator;

public class AdministratorDAOImpl extends HibernateDaoSupport implements AdministratorDAO {
	
    private HibernateTemplate ht;
    
	@Override
	public List<Administrator> getAdminByLoginName(String loginName) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		String sql = "from Administrator";
		System.out.println(ht);
		List rs = ht.find(sql);
		return (List<Administrator>)rs;
	}
}
