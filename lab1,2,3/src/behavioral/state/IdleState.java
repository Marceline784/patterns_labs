package behavioral.state;

public class IdleState implements State {

    private final CoffeeMachine machine;

    public IdleState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onEnterState() {
        System.out.println(machine + " is ready.");
    }

    @Override
    public void makeCoffee() {
        System.out.println(machine + " starts brewing coffee.");
    }
}
