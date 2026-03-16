package structural.adapter;

public class App {

    private final MusicPlayer player;

    public App(MusicPlayer player) {
        this.player = player;
    }

    public void play(String song) {
        player.playSong(song);
    }
}
