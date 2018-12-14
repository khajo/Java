package car;

import java.util.Arrays;
import java.util.List;

public class CarApplication {
    public static void main(String[] args) {

        List<String> carsBrands = Arrays.asList("Audi", "Mercedes", "Seat", "Skoda", "Tesla", "Bmw", "Peugeot", "Citroen", "Jeep", "Ferrari");
        Hansel hansel = new Hansel();
        Cars cars = new Cars();
        for (String carsBrand : carsBrands) {
            Car car = cars.getNextCar(carsBrand);
         String message=   hansel.haveATry(car);
            System.out.println(message);

        }



    }
}
