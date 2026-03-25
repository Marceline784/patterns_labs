package behavioral.state;

public class OutOfWaterState implements State {

    private final CoffeeMachine machine;

    public OutOfWaterState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void onEnterState() {
        System.out.println(machine + " has no water!");
    }

    @Override
    public void makeCoffee() {
        System.out.println(machine + " cannot make coffee. Add water!");
    }
}
