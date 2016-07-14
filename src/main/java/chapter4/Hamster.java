package chapter4;

public class Hamster {
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Hamster(int weight) { // first constructor
        this.weight = weight;
        color = "brown";
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}
