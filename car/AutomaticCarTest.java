package car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticCarTest {

    @Test
    void driveManualCar() {
        Hansel hansel = new Hansel();
        Car car = new ManualCar("Audi");

        String message = hansel.haveATry(car);
        String expected = "I love this Manaul Audi";
        assertEquals(expected,message );

    }

    @Test
    void driveAutomaticCar() {
        Hansel hansel = new Hansel();
        Car car = new AutomaticCar("Audi");

        String message = hansel.haveATry(car);
        String expected = "I love this Automatic Audi";
        assertEquals(expected,message );

    }
}