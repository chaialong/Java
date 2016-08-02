package chapter5.virtual.method;

/**
 * Created by chaialong on 8/2/2016.
 */
public class Eagle extends Bird {
    public String name(){
        return "Eagle";
    }

    public static void main(String[] args) {
        Bird bird = new Eagle();
        System.out.println(bird.name());
    }
}
