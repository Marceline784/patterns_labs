package structural.facade;

public class Projector {
    public void on() {
        System.out.println("Projector is now ON.");
    }

    public void off() {
        System.out.println("Projector is now OFF.");
    }

    public void playMovie(String movie) {
        System.out.println("Projector starts playing: " + movie);
    }
}
