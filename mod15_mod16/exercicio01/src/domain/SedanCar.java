package domain;

import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public class SedanCar extends Car{
    public SedanCar(Color color, Location location) {
        super(CarType.SEDAN, color, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
    }
}
