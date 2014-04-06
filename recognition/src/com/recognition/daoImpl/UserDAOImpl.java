package com.recognition.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.recognition.dao.UserDAO;
import com.recognition.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	private HibernateTemplate ht = null;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		return (Integer) ht.save(user);
	}

	@Override
	public List<User> getUserByPhone(String phone) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		String sql = "from User where phone = '" + phone + "'";
		List<User> rs = (List<User>) ht.find(sql);
		return rs;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		ht.update(user);
	}

	@Override
	public void addUser(User user, String departName) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		int uid = addUser(user);
		String sql = "update User set departName = '" + departName +"' where uid = " + String.valueOf(uid);
		ht.bulkUpdate(sql);
	}

}
