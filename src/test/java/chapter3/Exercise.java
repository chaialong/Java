package chapter3;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise {
    @Test
    public void Exercise(){
        String s1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(s1 == "Hello");
        System.out.println(sb.equals("Hello"));
        System.out.println(sb.toString() == "Hello");

    }

    @Test
    public void test1(){
        String s = "Hello world";

        System.out.println(s.substring(1, 1));
        System.out.println(s.substring(1, 3));
        System.out.println(s.substring(3));

    }

    @Test
    public void test2(){
        StringBuilder sb = new StringBuilder("abcdefg");

        System.out.println(sb.toString().substring(5, 4).length());
    }

    @Test
    public void test3(){
        char[] c = new char[2];
        int length = c.length;

        ArrayList list = new ArrayList();
        int length2 = list.size();
    }

    @Test
    public void test4(){
        String[] s1 = {"aaa", "bbb"};
        String[] s2 = {"aaa", "bbb"};
        System.out.println(s1 == s2);

        ArrayList a1 = new ArrayList();
        a1.add("aaa");
        ArrayList a2 = new ArrayList();
        a2.add(("aaa"));
        System.out.println(a1 == a2);

    }

    @Test
    public void test5(){
        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }

    @Test
    public void test6(){
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
         Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);
    }

    @Test
    public void test7(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

        list.add(null);

        System.out.println(list);
    }

    @Test
    public void test8(){
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());
    }

    @Test
    public void test9(){
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        System.out.println(d);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));
    }

    @Test
    public void test10(){
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
                .SHORT);
        System.out.println(f.format(d));
    }

    @Test
    public void test11(){
        ArrayList al = new ArrayList();
        al.add(123);
        al.add(345);
    }

    @Test
    public void test12(){
        List<Integer> ages = new ArrayList<Integer>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);

//        for (int age : ages) System.out.print(age);

    }

    @Test
    public void test13(){
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());
    }

    @Test
    public void test14(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);

    }

    @Test
    public void test15(){
        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);
    }

    @Test
    public void test16(){
        List<String> list1 = new ArrayList<>();
        list1.add("hi");

        List<String> list2 = new ArrayList<>();
        list2.add("hi");

        System.out.println(list1.equals(list2));
    }

    @Test
    public void test17(){
        String str1 = "hello";
        String str2 = new String(str1);

        System.out.println(str1 == str2);
        System.out.println("hello" == str1);
        System.out.println("hello" == str2);
    }

    @Test
    public void test18(){
        String letters = "abcdef";
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));
        System.out.println(letters.charAt(6));
    }

    @Test
    public void test19(){
        StringBuilder b = new StringBuilder("rumble");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);
    }

    @Test
    public void test20(){
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());
    }
}
