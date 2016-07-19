package chapter6.ex2;

import java.io.IOException;
import java.util.IllegalFormatException;

public class Test1 {
    public static void main(String[] args) {
        Object obj = new Integer(3);

        String str = (String) obj;

        System.out.println(str);
    }

    public Exception test(){
        return new Exception();
    }

    public void ohNo() throws IOException {
        //System.out.println("it's ok");
        throw new IllegalArgumentException();
    }
}
