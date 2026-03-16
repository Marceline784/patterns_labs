package structural.facade;

public class Main {
    public static void main(String[] args) {
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        CinemaFacade cinema = new CinemaFacade(projector, soundSystem, screen);

        cinema.startMovie("Avengers: Endgame");
        // тут можна уявити, що йде фільм…
        cinema.endMovie();
    }
}