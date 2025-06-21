package com.omkar.SpringDataJpaEx.Model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(Main.class,args);

        StudentRepo repo=context.getBean(StudentRepo.class);

        Student s1=context.getBean(Student.class);
        Student s2=context.getBean(Student.class);
        Student s3=context.getBean(Student.class);

//
//        s1.setRollNo(1);
//        s1.setName("Omkar");
//        s1.setMarks(89);
//
//        s2.setRollNo(2);
//        s2.setName("Sunny");
//        s2.setMarks(87);
//
//        s3.setRollNo(3);
//        s3.setName("Abhi");
//        s3.setMarks(90);
//

        System.out.println(repo.findAll());
    }
}
