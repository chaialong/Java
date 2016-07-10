package chapter3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    @Test
    public void Test(){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.toString();
    }
}
