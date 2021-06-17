package class6;

public class Car {
    private String carName;
    private int price;
    private String typePerimeter;

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                ", typePerimeter=" + typePerimeter +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypePerimeter() {
        return typePerimeter;
    }

    public void setTypePerimeter(String typePerimeter) {
        this.typePerimeter = typePerimeter;
    }
}
