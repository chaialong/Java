package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Ex26 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt("1"));
        list.add(Integer.valueOf("2"));
        list.add(3);
        list.add(null);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
