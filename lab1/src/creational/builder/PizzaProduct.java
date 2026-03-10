package creational.builder;

import java.util.List;

public class PizzaProduct implements Pizza {

    private final Dough dough;
    private final Sauce sauce;
    private final List<Topping> toppings;

    public PizzaProduct(Dough dough, Sauce sauce, List<Topping> toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    @Override
    public String description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza with ").append(dough.description())
                .append(", ").append(sauce.description())
                .append(", toppings: ");
        for (Topping t : toppings) {
            sb.append(t.description()).append(" ");
        }
        return sb.toString();
    }
}
