package annotation.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Programmer {
    private String position;
    private long salary;

    @Resource(name = "car2")
    private Car car;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
