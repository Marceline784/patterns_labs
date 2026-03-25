package behavioral.command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Heater heater = new Heater();

        Command lightCommand = new LightCommand(light);
        Command heaterCommand = new HeaterCommand(heater);

        SmartHomeController controller = new SmartHomeController(lightCommand);

        controller.pressButton(); // світло

        controller.setCommand(heaterCommand);
        controller.pressButton(); // обігрівач
    }
}