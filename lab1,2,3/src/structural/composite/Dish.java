package structural.composite;

public class Dish extends MenuComponent {

    private final String name;
    private final double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + " - $" + price);
    }
}