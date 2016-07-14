package chapter4;

import org.junit.Test;

import java.util.ArrayList;

public class Chapter4Test {
    private static final ArrayList<String> values = new ArrayList<String>();

    @Test
    public void test1(){

        values.add("123");
        values.add("abc");

        System.out.println(values);
    }

    @Test
    public void test2(){
        Integer i = new Integer(1);
        System.out.println(i);
        increase(i);
        System.out.println(i);
    }

    private void increase(Integer integer) {
        integer++;
    }

    @Test
    public void test3(){
        Hamster h = new Hamster(123);

        System.out.println(h.toString());
    }

    @Test
    public void test4(){
        InitializationOrderSimple i = new InitializationOrderSimple();


    }
}
