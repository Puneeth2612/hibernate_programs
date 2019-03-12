package com.crud.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class CreateStudent {
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		// create Session

		Session session = factory.getCurrentSession();

		try {
			// creating student object
			Student student2 = new Student("Puneeth1", "Moola1", "puneethmoola@gmail.com4");
			Student student3 = new Student("Puneeth2", "Moola2", "puneethmoola@gmail.com");
			Student student4 = new Student("Puneeth3", "Moola3", "puneethmoola@gmail.com");
			// start a transaction
			session.beginTransaction();
			// save student object
			session.save(student2);
			session.save(student3);
			session.save(student4);
			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
