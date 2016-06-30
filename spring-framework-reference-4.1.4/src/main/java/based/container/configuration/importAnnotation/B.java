package based.container.configuration.importAnnotation;

public class B {
    private String name;

    public B(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}
