package structural.decorator;

public class BasicPhone implements Smartphone {

    @Override
    public String getDescription() {
        return "Basic Smartphone";
    }

    @Override
    public double cost() {
        return 200.0;
    }
}