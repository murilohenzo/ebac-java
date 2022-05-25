package factories;

import domain.Car;
import domain.LuxuryCar;
import domain.SedanCar;
import domain.SmallCar;
import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public class USACarFactory {
    public static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case SMALL:
                car = new SmallCar(Color.BLACK, Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Color.BLACK, Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Color.WHITE, Location.USA);
                break;
            default:
                break;
        }
        return car;
    }
}
