package week_8.thermostat;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    private Predicate<Double> condition;
    private Function<Double, String> display;


    public Thermostat(Predicate<Double> condition, Function<Double, String> display) {
        this.condition = condition;
        this.display = display;
    }


    public String sence(Double temperature) {

        if (getCondition().test(temperature)) {
            return getDisplay().apply(temperature);
        }

        return "Warrning";

    }

    public Predicate<Double> getCondition() {
        return condition;
    }

    public void setCondition(Predicate<Double> condition) {
        this.condition = condition;
    }

    public Function<Double, String> getDisplay() {
        return display;
    }

    public void setDisplay(Function<Double, String> display) {
        this.display = display;
    }
}



//
//    Create the Thermostat class.
//        The Thermostat has a trigger condition and a display function. It receives them via constructor, so they can be customized every time a new one is created.
//        The Thermostat has the sense method that receives the temperature in degrees Celsius as a Double and returns a String with a message. As long as the condition doesn’t get triggered, the message provided by the display function is returned. If the condition gets triggered, then the message “Warning!” is returned.
//        Create the ThermostatTest class to make sure the Thermostat works correctly in the scenarios provided by Hansel.
//        Scenarios provided by Hansel:
//        Hansel goes skiing and creates his Thermostat to warn him when the temperature is under 0 degrees Celsius. The display message should show the temperature received by the sense method followed by the right temperature measurement kind, as in “12.3 degrees Celsius”.
//        He checks the Thermostat when the temperature is 2 degrees Celsius and the message says “2.0 degrees Celsius”.
//        He checks the Thermostat when the temperature is -1 degrees Celsius and the message says “Warning!”.
//        Hansel goes to the sauna and creates his Thermostat to warn him when the temperature is at least 80 degrees Celsius. The display message should show the temperature received by the sense method transformed in degrees Kelvin followed by the right temperature measurement kind, as in “352.15 degrees Kelvin”.
//        He checks the Thermostat when the temperature is 79 degrees Celsius and the message says “352.15 degrees Kelvin”.
//        He checks the Thermostat when the temperature is 80 degrees Celsius and the message says “Warning!”