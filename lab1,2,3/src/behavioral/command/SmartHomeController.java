package behavioral.command;

public class SmartHomeController {

    Command command;

    public SmartHomeController(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}