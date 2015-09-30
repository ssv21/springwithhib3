package org.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


public class AbcDAOimpl implements AbcDAO {
	//private SessionFactory sessionfactory;
	private HibernateTemplate hibtem;
	
	public void setHibtem(HibernateTemplate hibtem) {
		this.hibtem = hibtem;
	}

//	public void setSessionfactory(SessionFactory sessionfactory) {
//		this.sessionfactory = sessionfactory;
//	}

	@Override
	public void Save() {
		Abc ab =new Abc(1,"what is java");
		hibtem.saveOrUpdate(ab);
	}
}
