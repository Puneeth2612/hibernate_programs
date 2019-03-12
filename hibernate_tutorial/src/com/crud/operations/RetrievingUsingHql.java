package com.crud.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class RetrievingUsingHql {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student").list();

			for (Student student : theStudents) {
				System.out.println(student);

			}
			session.getTransaction().commit();
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {

			sessionFactory.close();
		}

	}

}
