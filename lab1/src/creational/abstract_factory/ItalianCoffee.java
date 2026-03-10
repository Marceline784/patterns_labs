package creational.abstract_factory;

public class ItalianCoffee implements Coffee {

    private static final String DESCRIPTION = "Italian espresso";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}