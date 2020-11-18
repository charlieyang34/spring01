package com.myjava.test;


import com.myjava.pojo.Category;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestSpring {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});

        Category c = (Category) context.getBean("c");

        System.out.println(c.getName());

    }
}
