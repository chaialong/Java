package com.example;

import com.example.pnamespace.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chaialong on 6/26/2016.
 */
public class PNamespaceMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"pnamespace.xml"});
        Person p = context.getBean("john-classic", Person.class);
        Person p2 = context.getBean("john-modern", Person.class);

        System.out.println(p);
        System.out.println(p2);
    }
}
