package com.recognition.daoImpl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.recognition.dao.SignatureDAO;
import com.recognition.entity.Signature;

public class SignatureDAOImpl extends HibernateDaoSupport implements SignatureDAO{

	HibernateTemplate ht;
	@Override
	public int addSignature(Signature sign) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		return (Integer) ht.save(sign);
	}

	@Override
	public void updateSignature(Signature sign) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		ht.update(sign);
	}
	
	@Override
	public void addSignature(Signature sign, int uid) {
		// TODO Auto-generated method stub
		ht = super.getHibernateTemplate();
		int sid = addSignature(sign);
		String sql = "update Signature set uid = " + String.valueOf(uid) + "where sid = " + String.valueOf(sid);
		ht.bulkUpdate(sql);
	}
}
