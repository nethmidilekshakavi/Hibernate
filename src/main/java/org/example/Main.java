package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.example.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();


        /*------------------------Student-------------------------------------------------*/
        Student student=new Student();

        student.setId("2");
        student.setName("nishan");
        student.setAddress("kalutara");

     /* save*/
        session.save(student);

        /*update*/
       session.update(student);

       /*delete*/
        session.delete(student);


        /*get*/
        List<Student> students = session.createQuery("from Stu ", Student.class).getResultList();
        System.out.println(students.size());


        /*------------------------Teacher-------------------------------------------------*/

        Teacher teacher = new Teacher();

        teacher.setId("2");
        teacher.setName("kamal");
        teacher.setAddress("Galle");

       /* save*/
        session.save(teacher);


        /*update*/
        session.update(teacher);

        /*delete*/
        session.delete(teacher);



        /*get*/
        List<Teacher> teachers = session.createQuery("from tea ", Teacher.class).getResultList();
        System.out.println(teachers.size());


        transaction.commit();
        session.close();


    }
}