package creational.abstract_factory;

public class AmericanDessert implements Dessert {

    private static final String DESCRIPTION = "Cheesecake";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
