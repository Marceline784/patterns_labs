package creational.abstract_factory;

public class AmericanDrink implements Drink {

    private static final String DESCRIPTION = "Milkshake";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
