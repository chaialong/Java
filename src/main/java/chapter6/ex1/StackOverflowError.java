package chapter6.ex1;

public class StackOverflowError {
    public static void doNotCodeThis(int i) {
        doNotCodeThis(1);
    }

    public static void main(String[] args) {
        doNotCodeThis(1);
    }
}
