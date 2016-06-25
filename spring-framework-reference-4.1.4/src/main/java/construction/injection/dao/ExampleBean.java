package construction.injection.dao;

/**
 * Created by chaialong on 6/25/2016.
 */
public class ExampleBean {
    private AnotherBean beanOne;
    private YetAnotherBean beanTwo;
    private int integerProperty;

    public ExampleBean(AnotherBean beanOne, YetAnotherBean beanTwo, int integerProperty) {
        this.beanOne = beanOne;
        this.beanTwo = beanTwo;
        this.integerProperty = integerProperty;
    }

    public int getIntegerProperty() {
        return integerProperty;
    }

    public void setIntegerProperty(int integerProperty) {
        this.integerProperty = integerProperty;
    }


    public AnotherBean getBeanOne() {
        return beanOne;
    }

    public void setBeanOne(AnotherBean beanOne) {
        this.beanOne = beanOne;
    }

    public YetAnotherBean getBeanTwo() {
        return beanTwo;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        this.beanTwo = beanTwo;
    }
}
