package domain;

import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public class SmallCar extends Car{
    public SmallCar(Color color, Location location) {
        super(CarType.SMALL, color, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
    }
}
