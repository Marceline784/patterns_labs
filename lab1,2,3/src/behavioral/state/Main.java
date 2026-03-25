package behavioral.state;

public class Main {
    public static void main() {

        CoffeeMachine machine = new CoffeeMachine();

        machine.makeCoffee();
        machine.timePasses();

        machine.makeCoffee();
        machine.timePasses();

        machine.makeCoffee();
        machine.timePasses();

        machine.makeCoffee();
    }
}
