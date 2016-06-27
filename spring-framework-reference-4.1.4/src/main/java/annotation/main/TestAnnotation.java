package annotation.main;

import annotation.dao.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"annotation.xml"});
        Customer customer = (Customer) context.getBean("CustomerBean");
        System.out.println(customer);

    }

}
