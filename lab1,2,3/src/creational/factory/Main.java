package creational.factory;

public class Main {
    public static void main(String[] args) {

        Transport car = TransportFactory.createTransport(TransportType.CAR);
        Transport bike = TransportFactory.createTransport(TransportType.BIKE);
        Transport bus = TransportFactory.createTransport(TransportType.BUS);

        System.out.println(car.getDescription());
        System.out.println(bike.getDescription());
        System.out.println(bus.getDescription());
    }
}
