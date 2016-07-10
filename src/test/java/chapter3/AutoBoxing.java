package chapter3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxing {
    @Test
    public void AutoBoxingTest(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.remove(new Integer(3));
        System.out.println(list);
    }

    @Test
    public void ListToArray(){
        List<String> list = new ArrayList<String>();
        list.add("awk");
        list.add("robin");
        Object[] object = list.toArray();
        System.out.println(object.length);
        System.out.println(object);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);
        System.out.println(stringArray);
    }

    @Test
    public void ArrayToList(){
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        list.set(1, "test");
        System.out.println(list);
        array[0] = "new";
        System.out.println(list);

        List<String> list2 = Arrays.asList("aa", "bb");

        List<String> list3 = new ArrayList<String>();
        list3.add("aaa");
        list3.add("bbb");
        System.out.println(list3);
        list3.remove(1);
        System.out.println(list3);
    }
}
