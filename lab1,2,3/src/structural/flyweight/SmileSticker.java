package structural.flyweight;

public class SmileSticker implements Sticker {

    @Override
    public void send(int x, int y) {
        System.out.println("Sending 😊 sticker at (" + x + "," + y + ") " +
                "(Sticker=" + System.identityHashCode(this) + ")");
    }
}
