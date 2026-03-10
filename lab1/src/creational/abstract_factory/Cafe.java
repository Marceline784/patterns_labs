package creational.abstract_factory;

public record Cafe(Coffee coffee, Dessert dessert, Drink drink) {

    public static class FactoryMaker {

        public static CafeFactory makeFactory(CafeType type) {
            return switch (type) {
                case ITALIAN -> new ItalianCafeFactory();
                case AMERICAN -> new AmericanCafeFactory();
            };
        }
    }
}
