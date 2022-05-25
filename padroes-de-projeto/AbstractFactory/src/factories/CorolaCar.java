package factories;

import domain.Car;
import domain.enums.Color;

public class CorolaCar extends Car {
    public CorolaCar(int horsePower, String fuelSource, Color color) {
        super(horsePower, fuelSource, color);
    }
}
