package creational.abstract_factory;
public class ItalianDrink implements Drink {

    private static final String DESCRIPTION = "Sparkling water";

    @Override
    public String description() {
        return DESCRIPTION;
    }
}
