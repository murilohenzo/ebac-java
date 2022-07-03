package factories;

import domain.Car;
import domain.enums.Color;

public class BrasiliaCar extends Car {
    public BrasiliaCar(int horsePower, String fuelSource, Color color) {
        super(horsePower, fuelSource, color);
    }
}
