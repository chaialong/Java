package com.hello;

import com.dao.ExampleBean;
import com.services.PetStoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"daos.xml", "services.xml"});

        PetStoreService service = context.getBean("petStore", PetStoreService.class);
        List<String> userList = service.getUsernameList();

        ExampleBean eb = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("Year: " + eb.getYears());
        System.out.println("Ultimate answer: " + eb.getUltimateAnswer());

    }
}
