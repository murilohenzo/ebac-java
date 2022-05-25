package factories;

import domain.Car;
import domain.LuxuryCar;
import domain.SedanCar;
import domain.SmallCar;
import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public class AsianCarFactory {
    public static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case SMALL:
                car = new SmallCar(Color.BLACK, Location.ASIAN);
                break;
            case SEDAN:
                car = new SedanCar(Color.BLACK, Location.ASIAN);
                break;
            case LUXURY:
                car = new LuxuryCar(Color.WHITE, Location.ASIAN);
                break;
            default:
                break;
        }
        return car;
    }
}
