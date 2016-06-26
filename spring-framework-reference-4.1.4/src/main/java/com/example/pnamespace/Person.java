package com.example.pnamespace;

/**
 * Created by chaialong on 6/26/2016.
 */
public class Person {
    private String name;
    private Person spouse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", spouse=" + spouse +
                '}';
    }
}
