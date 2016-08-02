package assessment;

public class StringDemo {
    private static String static_s1 = "hello";
    private static String static_s2 = "hello";

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
        System.out.println(static_s1 == static_s2);

        class1 c1 = new class1("hello");
        class2 c2 = new class2("hello");

        System.out.println(c1.s1 == c2.s2);

        StringBuilder sb = new StringBuilder();
        sb.append("Ja").append("va");

        System.out.println(sb.toString() == s1);
    }
}

class class1 {
    public String s1;

    public class1(String s1) {
        this.s1 = s1;
    }
}

class class2{
    public String s2;

    public class2(String s2) {
        this.s2 = s2;
    }
}
