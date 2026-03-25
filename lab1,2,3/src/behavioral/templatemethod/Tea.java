package behavioral.templatemethod;

public class Tea extends Beverage {

    @Override
    protected void boilWater() {
        System.out.println("Boiling water for tea...");
    }

    @Override
    protected void addMainIngredient() {
        System.out.println("Steeping the tea bag in hot water...");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Pouring tea into the cup...");
    }
}
