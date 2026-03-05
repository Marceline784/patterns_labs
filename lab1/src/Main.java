import creational.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creational Patterns Demo");

        // Singleton
        Singleton s = Singleton.getInstance();
        s.show();

        // Factory
        System.out.println(Factory.createAnimal("dog"));

        // Factory Method
        FactoryMethod fm = new FactoryMethod();
        FactoryMethod.Product p = fm.createProduct();
        p.use();

        // Abstract Factory
        AbstractFactory af = new AbstractFactory();
        AbstractFactory.Button b = af.createButton("windows");
        b.paint();

        // Builder
        Builder builder = new Builder();
        Builder.House house = builder.buildHouse();
        System.out.println(house.walls + " " + house.roof);

        // Prototype
        Prototype p1 = new Prototype("Object1");
        Prototype p2 = p1.clone();
        System.out.println(p2.name);

    }

}