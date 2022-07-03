package domain;

public class Truck implements ITransport{
    @Override
    public void deliver() {
        System.out.println("Delivery by truck");
    }
}
