package chapter5.ex1;

public class Animal extends Mammal {
    public double getWeight(){
        return super.getWeight() + 20;
    }

    public Integer fly(){
        return 1;
    }

    public void numOfLegs(){

    }
}
