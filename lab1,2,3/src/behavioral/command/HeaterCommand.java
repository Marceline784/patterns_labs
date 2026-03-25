package behavioral.command;

public class HeaterCommand implements Command {

    Heater heater;

    public HeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.turnOn();
    }
}