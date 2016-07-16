package chapter5.ex5.defaultInterface;

public class Cat implements Run, Walk {
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
