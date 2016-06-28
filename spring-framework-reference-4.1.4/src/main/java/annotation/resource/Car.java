package annotation.resource;

public class Car {
    private String brand;
    private int years;
    private long price;

    public Car(String brand, int years, long price) {
        this.brand = brand;
        this.years = years;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", years=" + years +
                ", price=" + price +
                '}';
    }
}
