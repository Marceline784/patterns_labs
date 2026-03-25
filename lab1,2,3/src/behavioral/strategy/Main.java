package behavioral.strategy;

public class Main {
    public static void main() {

        ShoppingCart cart = new ShoppingCart(new CardPayment());

        cart.checkout(100);

        cart.changeStrategy(new PayPalPayment());
        cart.checkout(200);

        cart.changeStrategy(new CashPayment());
        cart.checkout(50);
    }
}
