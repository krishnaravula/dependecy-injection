package com.sai.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student sai = context.getBean("sai",Student.class);
        sai.displayStudentInfo();
    }
}
