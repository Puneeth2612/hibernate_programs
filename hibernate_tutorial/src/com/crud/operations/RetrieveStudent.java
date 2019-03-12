package com.crud.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class RetrieveStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			Student s1 = new Student("Thommaks", "edison", "thomas.edison@gmail.com");
			session.beginTransaction();
			session.save(s1);
			session.getTransaction().commit();
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student s2 = session.get(Student.class, s1.getId());
			System.out.println(s2);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
