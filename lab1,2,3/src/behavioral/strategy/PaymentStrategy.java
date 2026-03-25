package behavioral.strategy;

@FunctionalInterface
public interface PaymentStrategy {

    void pay(int amount);
}
