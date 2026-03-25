package behavioral.state;

public class CoffeeMachine {

    private State state;

    public CoffeeMachine() {
        state = new IdleState(this);
    }

    public void timePasses() {
        if (state.getClass().equals(IdleState.class)) {
            changeStateTo(new BrewingState(this));
        } else if (state.getClass().equals(BrewingState.class)) {
            changeStateTo(new OutOfWaterState(this));
        } else {
            changeStateTo(new IdleState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    public void makeCoffee() {
        state.makeCoffee();
    }

    @Override
    public String toString() {
        return "Coffee machine";
    }
}
