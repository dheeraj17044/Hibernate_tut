package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isClosed());

        // entity to save
        Student student = new Student(1,"Dheeraj","New Delhi");
        Student student2 = new Student(2,"Deepak","New Delhi");
        Student student3 = new Student(3,"Deepanshu","Faridabad");
//        student.toString();

        System.out.println("student info ::::::    " +student3);

        // opening session
        Session session = sessionFactory.openSession();
        // creating transaction
        Transaction tx = session.beginTransaction();

        try{
            // saving the entity
            session.save(student3);
        }catch (Exception e){
            e.printStackTrace();
        }

        // committing transaction
        tx.commit();
        // closing session
        session.close();
    }
}
