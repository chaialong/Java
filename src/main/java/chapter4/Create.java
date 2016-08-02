package chapter4;

import chapter5.q10.Interface1;

/**
 * Created by chaialong on 7/28/2016.
 */
public class Create {
    Create() {
        System.out.println("1 ");
    }

    Create(int... num) {
        System.out.println("2 ");
    }

    Create(Integer num) {
        System.out.println("3 ");
    }

    Create(int num) {
        System.out.println("4 ");
    }

    public static void main(String[] args) {
        Create c = new Create(1);
    }
}
