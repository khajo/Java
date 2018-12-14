package car;

public class ManualCar extends Car {

    public ManualCar(String brand) {
        super(brand);
    }

    @Override
    public String drive() {
        return "I love this Manaul "+ getBrand();
    }
}
