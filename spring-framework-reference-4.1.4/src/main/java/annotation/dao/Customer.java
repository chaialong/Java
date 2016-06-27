package annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by chaialong on 6/27/2016.
 */
public class Customer {
    private String action;
    private int type;
    @Autowired
    private Person person;

    @Override
    public String toString() {
        return "Customer{" +
                "action='" + action + '\'' +
                ", type=" + type +
                ", person=" + person +
                '}';
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
