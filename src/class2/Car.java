package class2;

public class Car {
    private String name;
    private String corp;
    private Double price;
    private int maxSpeed;

    public Car(String name, String corp, Double price, int maxSpeed) {
        this.name = name;
        this.corp = corp;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
