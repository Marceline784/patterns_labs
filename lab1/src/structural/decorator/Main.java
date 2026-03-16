package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new BasicPhone();
        System.out.println(phone.getDescription() + " $" + phone.cost());

        // Додаємо камеру
        phone = new CameraDecorator(phone);
        System.out.println(phone.getDescription() + " $" + phone.cost());

        // Додаємо GPS
        phone = new GPSDecorator(phone);
        System.out.println(phone.getDescription() + " $" + phone.cost());
    }
}
