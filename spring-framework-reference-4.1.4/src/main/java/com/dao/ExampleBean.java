package com.dao;

import java.beans.ConstructorProperties;

/**
 * Created by chaialong on 6/25/2016.
 */
public class ExampleBean {
    private int years;
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    public int getYears() {
        return years;
    }

    public String getUltimateAnswer() {
        return ultimateAnswer;
    }
}
