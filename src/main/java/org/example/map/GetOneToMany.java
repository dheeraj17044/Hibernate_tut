package org.example.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetOneToMany {

    public static void main(String[]args){

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Department d1 = (Department) session.get(Department.class,101);

        for(Employee employee: d1.getEmployeeList()){
            System.out.println(employee.getEmployeeId());
            System.out.println(employee.getEmployeeName());
            System.out.println(employee.getEmployeeDepartment().getDepartmentId());

            System.out.println();
            System.out.println();
        }

        session.close();
        sessionFactory.close();
    }
}
