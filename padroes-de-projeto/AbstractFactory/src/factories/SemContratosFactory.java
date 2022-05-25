package factories;

import factories.BrasiliaCar;
import domain.Car;
import domain.enums.Color;
import factories.IFactory;

public class SemContratosFactory implements IFactory {

    private final String request;

    public SemContratosFactory(String request) {
        this.request = request;
    }
    @Override
    public Car retrieveCar(String request) {
        if ("A".equals(request)) {
            return new BrasiliaCar(100, "cheio", Color.RED);
        } else {
            return null;
        }
    }
}
