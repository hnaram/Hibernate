package com.redhat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.redhat.*;

public class Test {

	public static void main(String[] args) {
		
		Userdetails user=new Userdetails();
		user.setUserId(1);
		user.setUserName("Herambh");
		
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

	}

}
