package creational.builder;

public class Main {

    public static void main(String[] args) {

        Pizza margherita = new PizzaBuilder()
                .withDough(new ThinDough())
                .withSauce(new TomatoSauce())
                .addTopping(new CheeseTopping())
                .build();

        Pizza pepperoni = new PizzaBuilder()
                .withDough(new ThickDough())
                .withSauce(new TomatoSauce())
                .addTopping(new CheeseTopping())
                .addTopping(new PepperoniTopping())
                .build();

        Pizza veggie = new PizzaBuilder()
                .withDough(new ThinDough())
                .withSauce(new WhiteSauce())
                .addTopping(new CheeseTopping())
                .addTopping(new VeggieTopping())
                .build();

        System.out.println(margherita.description());
        System.out.println(pepperoni.description());
        System.out.println(veggie.description());
    }
}
