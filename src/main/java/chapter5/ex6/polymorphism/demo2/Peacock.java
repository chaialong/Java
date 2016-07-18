package chapter5.ex6.polymorphism.demo2;

public class Peacock extends Bird {
    public String getName(){
        return "peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.desplayInfo();
    }
}
