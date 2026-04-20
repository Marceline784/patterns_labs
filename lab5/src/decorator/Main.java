package decorator;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new BasicPhone();
        System.out.println(phone.getDescription() + " $" + phone.cost());

        // Додаємо камеру (викликаємо функцію як декоратор)
        phone = PhoneUpgrade.withCamera.apply(phone);
        System.out.println(phone.getDescription() + " $" + phone.cost());

        // Додаємо GPS (викликаємо функцію як декоратор)
        phone = PhoneUpgrade.withGPS.apply(phone);
        System.out.println(phone.getDescription() + " $" + phone.cost());
    }
}