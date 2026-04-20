package decorator;

import java.util.function.Function;

public class PhoneUpgrade {

    // Функція, яка додає камеру
    public static Function<Smartphone, Smartphone> withCamera = phone -> new Smartphone() {
        @Override
        public String getDescription() { return phone.getDescription() + " + Camera"; }
        @Override
        public double cost() { return phone.cost() + 100.0; }
    };

    // Функція, яка додає GPS
    public static Function<Smartphone, Smartphone> withGPS = phone -> new Smartphone() {
        @Override
        public String getDescription() { return phone.getDescription() + " + GPS"; }
        @Override
        public double cost() { return phone.cost() + 50.0; }
    };
}