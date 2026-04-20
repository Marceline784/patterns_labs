package strategy;

public class Main {

    public static void payByCard(int amount) {
        System.out.println("Paid " + amount + "$ using credit card.");
    }

    public static void payByPayPal(int amount) {
        System.out.println("Paid " + amount + "$ using PayPal.");
    }

    public static void payInCash(int amount) {
        System.out.println("Paid " + amount + "$ in cash.");
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(Main::payByCard);
        cart.checkout(100);

        cart.changeStrategy(Main::payByPayPal);
        cart.checkout(200);

        cart.changeStrategy(Main::payInCash);
        cart.checkout(50);
    }
}
