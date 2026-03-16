package creational.abstract_factory;

public class ItalianDessert implements Dessert {

    private static final String DESCRIPTION = "Tiramisu";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
