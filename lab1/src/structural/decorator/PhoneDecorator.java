package structural.decorator;

public abstract class PhoneDecorator implements Smartphone {

    protected final Smartphone decoratedPhone;

    public PhoneDecorator(Smartphone phone) {
        this.decoratedPhone = phone;
    }

    @Override
    public String getDescription() {
        return decoratedPhone.getDescription();
    }

    @Override
    public double cost() {
        return decoratedPhone.cost();
    }
}
