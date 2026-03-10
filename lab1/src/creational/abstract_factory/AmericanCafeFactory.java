package creational.abstract_factory;

public class AmericanCafeFactory implements CafeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new AmericanDessert();
    }

    @Override
    public Drink createDrink() {
        return new AmericanDrink();
    }
}
