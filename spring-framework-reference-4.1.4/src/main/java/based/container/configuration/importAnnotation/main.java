package based.container.configuration.importAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);

        A a = context.getBean(A.class);
        System.out.println(a);
        B b = context.getBean(B.class);
        System.out.println(b);
    }
}
