package creational.abstract_factory;

public class ItalianCafeFactory implements CafeFactory {

    @Override
    public Coffee createCoffee() {
        return new ItalianCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new ItalianDessert();
    }

    @Override
    public Drink createDrink() {
        return new ItalianDrink();
    }
}