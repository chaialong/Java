package setter.injection.dao;

/**
 * Created by chaialong on 6/25/2016.
 */
public class YetAnotherBean {
    private String name;

    public String getName() {
        return name;
    }

    public YetAnotherBean(String name) {
        this.name = name;
    }
}
