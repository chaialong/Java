package annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"qualifier.xml"});

        Programmer p = (Programmer) context.getBean("programmer");
        System.out.println(p);
    }
}
