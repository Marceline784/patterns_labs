package structural.adapter;

public class MP3PlayerAdapter implements MusicPlayer {

    private final OldMP3Player oldPlayer = new OldMP3Player();

    @Override
    public void playSong(String songName) {
        oldPlayer.playTrack(songName);
    }
}
