package domain;

import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public class LuxuryCar extends Car{
    public LuxuryCar(Color color, Location location) {
        super(CarType.LUXURY, color, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
    }
}
