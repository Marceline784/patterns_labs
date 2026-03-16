package structural.decorator;

public class GPSDecorator extends PhoneDecorator {

    public GPSDecorator(Smartphone phone) {
        super(phone);
    }

    @Override
    public String getDescription() {
        return decoratedPhone.getDescription() + " + GPS";
    }

    @Override
    public double cost() {
        return decoratedPhone.cost() + 50.0;
    }
}
