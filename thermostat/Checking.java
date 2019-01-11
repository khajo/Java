package week_8.thermostat;

public class Checking {

    public  String skiing(Double temperature) {
        Thermostat thermostat = new Thermostat(e -> e > 0 && e < 12.3, e -> e.toString());
        return thermostat.sence(temperature);
    }

    public  String souna(Double teperature) {
        Thermostat thermostat = new Thermostat(e -> e<80 , e -> e.toString());
        return thermostat.sence(teperature);
    }


}
