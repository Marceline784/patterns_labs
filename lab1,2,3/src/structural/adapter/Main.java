package structural.adapter;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MP3PlayerAdapter();
        App app = new App(player);

        app.play("Bohemian Rhapsody");
   }
}
