package com.one.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourse {
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Details.class).addAnnotatedClass(Course.class).buildSessionFactory();
		// create Session

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			// getting id from db
			int id = 1;
			Instructor tempIns = session.get(Instructor.class, id);
			Course tempcourse = new Course("java");
			Course tempcourse2 = new Course("oracle");

			// add courses to instructor
			tempIns.addCourse(tempcourse);
			tempIns.addCourse(tempcourse2);

			session.save(tempcourse);
			session.save(tempcourse2);
			// Student student2 = new Student("Puneeth1", "Moola1",
			// "puneethmoola@gmail.com4");
			// Student student3 = new Student("Puneeth2", "Moola2",
			// "puneethmoola@gmail.com");
			// Student student4 = new Student("Puneeth3", "Moola3",
			// "puneethmoola@gmail.com");
			// start a transaction
			
			// save student object
			session.save(tempIns);

			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
			session.close();
		}

	}

}