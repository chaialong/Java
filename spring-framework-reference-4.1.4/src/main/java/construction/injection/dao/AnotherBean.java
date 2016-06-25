package construction.injection.dao;

/**
 * Created by chaialong on 6/25/2016.
 */
public class AnotherBean {
    private String name;

    public String getName() {
        return name;
    }

    public AnotherBean(String name) {
        this.name = name;
    }
}
