package construction.injection.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import construction.injection.dao.ExampleBean;

/**
 * Created by chaialong on 6/25/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"constructionInjection.xml"});

        ExampleBean eb = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("Bean 1: "+ eb.getBeanOne().getName());
        System.out.println("Bean 2: " + eb.getBeanTwo().getName());
        System.out.println("Integer: " + eb.getIntegerProperty());
    }
}
