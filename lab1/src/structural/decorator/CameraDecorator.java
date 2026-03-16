package structural.decorator;

public class CameraDecorator extends PhoneDecorator {

    public CameraDecorator(Smartphone phone) {
        super(phone);
    }

    @Override
    public String getDescription() {
        return decoratedPhone.getDescription() + " + Camera";
    }

    @Override
    public double cost() {
        return decoratedPhone.cost() + 100.0;
    }
}
