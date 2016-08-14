package chapter4.q18;

/**
 * Created by chaialong on 8/3/2016.
 */
public class ThisDemo {
    private static final int num;
    static {
        num = 10;
    }

    private ThisDemo() {
        System.out.println("private constructor");
    }

    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo();
    }
}
