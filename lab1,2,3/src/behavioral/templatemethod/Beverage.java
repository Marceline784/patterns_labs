package behavioral.templatemethod;

public abstract class Beverage {

    protected abstract void boilWater();
    protected abstract void addMainIngredient();
    protected abstract void pourInCup();

    public final void prepareRecipe() {
        boilWater();
        addMainIngredient();
        pourInCup();
        System.out.println("Your beverage is ready!\n");
    }
}