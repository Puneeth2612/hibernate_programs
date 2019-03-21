package com.one.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class CreateDemo {
	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Details.class).addAnnotatedClass(Course.class).buildSessionFactory();
		// create Session

		Session session = factory.getCurrentSession();

		try {
			// creating student object
			Instructor tempIns = new Instructor("Puneeth", "Moola", "pm@gmail,com");
			Details details = new Details("Rep", "eat");
			tempIns.setDetails(details);

			// Student student2 = new Student("Puneeth1", "Moola1",
			// "puneethmoola@gmail.com4");
			// Student student3 = new Student("Puneeth2", "Moola2",
			// "puneethmoola@gmail.com");
			// Student student4 = new Student("Puneeth3", "Moola3",
			// "puneethmoola@gmail.com");
			// start a transaction
			session.beginTransaction();
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