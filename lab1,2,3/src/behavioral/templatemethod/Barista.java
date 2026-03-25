package behavioral.templatemethod;

public class Barista {

    private Beverage beverage;

    public Barista(Beverage beverage) {
        this.beverage = beverage;
    }

    public void prepare() {
        beverage.prepareRecipe();
    }

    public void changeBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
