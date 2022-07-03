package factories;

import domain.Car;
import domain.enums.CarType;
import domain.enums.Location;

public class CarFactory {
    private CarFactory() {}

    public static Car buildCar(CarType type, Location location) {
        Car car = null;
        switch (location) {
            case USA:
                car =  USACarFactory.buildCar(type);
                break;
            case ASIAN:
                car =  AsianCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
                break;
        }
        return car;
    }
}
