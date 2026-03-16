package structural.proxy;

public class GameRoomProxy implements Room {

    private static final int MAX_PLAYERS = 3; // ліміт гравців
    private int currentPlayers = 0;

    private final Room room;

    public GameRoomProxy(Room room) {
        this.room = room;
    }

    @Override
    public void enter(Player player) {
        if (currentPlayers < MAX_PLAYERS) {
            room.enter(player);
            currentPlayers++;
        } else {
            System.out.println(player + " cannot enter, the room is full!");
        }
    }
}
