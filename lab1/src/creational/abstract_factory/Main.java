package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {

        CafeFactory factory = Cafe.FactoryMaker.makeFactory(CafeType.ITALIAN);
        //AMERICAN
        //ITALIAN
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        Drink drink = factory.createDrink();

        System.out.println("Cafe menu:");

        System.out.println("Coffee: " + coffee.description());
        System.out.println("Dessert: " + dessert.description());
        System.out.println("Drink: " + drink.description());
    }
}