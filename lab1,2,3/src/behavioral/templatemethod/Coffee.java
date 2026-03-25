package behavioral.templatemethod;

public class Coffee extends Beverage {

    @Override
    protected void boilWater() {
        System.out.println("Boiling water for coffee...");
    }

    @Override
    protected void addMainIngredient() {
        System.out.println("Adding ground coffee to hot water...");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring coffee into the cup...");
    }
}