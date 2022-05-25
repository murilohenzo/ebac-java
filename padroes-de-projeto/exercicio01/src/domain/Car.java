package domain;

import domain.enums.CarType;
import domain.enums.Color;
import domain.enums.Location;

public abstract class Car {
    private final CarType type;
    private final Color color;

    private final Location location;

    protected Car(CarType type, Color color, Location location) {
        this.type = type;
        this.color = color;
        this.location = location;
    }

    protected abstract void construct();

    public CarType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Model: " + type +
                ", color: " + color +
                ", built in " + location;
    }
}
