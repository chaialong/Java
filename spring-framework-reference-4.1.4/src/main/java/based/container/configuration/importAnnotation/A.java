package based.container.configuration.importAnnotation;

/**
 * Created by chaialong on 6/30/2016.
 */
public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
