package com.example;

import com.example.collection.Foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by chaialong on 6/26/2016.
 */
public class MainFoo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"foo.xml"});
        Foo foo = context.getBean("foo", Foo.class);
        Map<String, Float> map = foo.getAccounts();

        System.out.println("two: " + map.get("two"));

    }
}
