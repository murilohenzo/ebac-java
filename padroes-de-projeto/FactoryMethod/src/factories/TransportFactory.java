package factories;

import domain.Ship;
import domain.TransportType;
import domain.Truck;

public class TransportFactory {
    public TransportFactory() {
    }

    public static void getTransport(TransportType type) {
        switch (type) {
            case SHIP:
                new Ship().deliver();
                break;
            case TRUCK:
                new Truck().deliver();
                break;
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }
    }
}
