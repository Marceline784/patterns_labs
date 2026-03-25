package behavioral.state;

public class BrewingState implements State {

    private final CoffeeMachine machine;

    public BrewingState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onEnterState() {
        System.out.println(machine + " is brewing coffee.");
    }

    @Override
    public void makeCoffee() {
        System.out.println(machine + " is already making coffee.");
    }
}
