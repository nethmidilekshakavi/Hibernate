package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();
        Student student=new Student();
        ArrayList<Student> student1=new ArrayList<>();
        student.setId("2");
      /*  student.setName("nishan");
        student.setAddress("kalutara");*/
       /* session.save(student);*/
       /*session.update(student);*/
      /*  session.delete(student);*/




        transaction.commit();
        session.close();


    }
}