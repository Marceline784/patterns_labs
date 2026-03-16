package structural.facade;

public class CinemaFacade {

    private final Projector projector;
    private final SoundSystem soundSystem;
    private final Screen screen;

    public CinemaFacade(Projector projector, SoundSystem soundSystem, Screen screen) {
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void startMovie(String movie) {
        System.out.println("\nPreparing movie theater...");
        screen.lower();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(7);
        projector.playMovie(movie);
        System.out.println("Movie started!\n");
    }

    public void endMovie() {
        System.out.println("\nEnding movie...");
        projector.off();
        soundSystem.off();
        screen.raise();
        System.out.println("Movie ended.\n");
    }
}
