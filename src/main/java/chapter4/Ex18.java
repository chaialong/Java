package chapter4;

/**
 * Created by chaialong on 7/27/2016.
 */
public class Ex18 {
    String name = "test";
    private Ex18() {
        System.out.println("Private constructor");
    }

    public static void main(String[] args) {
        Ex18 e = new Ex18();
    }
}
