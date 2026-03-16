package creational.abstract_factory;

public class AmericanCoffee implements Coffee {

    private static final String DESCRIPTION = "Americano coffee";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
