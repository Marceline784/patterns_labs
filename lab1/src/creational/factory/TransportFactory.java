package creational.factory;

public class TransportFactory {

    public static Transport createTransport(TransportType type) {
        switch (type) {
            case CAR -> { return new Car(); }
            case BIKE -> { return new Bike(); }
            case BUS -> { return new Bus(); }
            default -> throw new IllegalArgumentException("Unknown TransportType");
        }
    }
}
