package example;

import example.collection.ComplexObject;
import example.collection.MergeCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by chaialong on 6/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"complexObject.xml","mergeCollection.xml"});
        ComplexObject co = context.getBean("complexObjects", ComplexObject.class);
        MergeCollection mc = context.getBean("child", MergeCollection.class);
        Properties props = co.getAdminEmails();
        List myList = co.getSomeList();
        Map map = co.getSomeMap();
        Set set = co.getSomeSet();
        Properties mergeProps = mc.getAdminEmails();
        System.out.println("Administrator: " + props.getProperty("administrator"));
        System.out.println("MyList[0]: " + (String) myList.get(0));
        System.out.println("Map: " + map.get("an entry"));
        System.out.println("Set: " + set.toString());

    }
}
