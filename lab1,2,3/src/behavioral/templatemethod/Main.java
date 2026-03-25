package behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {

        Barista barista = new Barista(new Tea());
        barista.prepare();

        barista.changeBeverage(new Coffee());
        barista.prepare();
    }
}
