package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private Dough dough;
    private Sauce sauce;
    private final List<Topping> toppings = new ArrayList<>();

    public PizzaBuilder withDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    public PizzaBuilder withSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addTopping(Topping topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new PizzaProduct(dough, sauce, toppings);
    }
}
