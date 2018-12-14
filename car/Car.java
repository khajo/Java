package car;

public abstract class Car {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public abstract String drive();

    public String getBrand() {
        return brand;
    }
}

