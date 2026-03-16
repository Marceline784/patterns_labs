package structural.proxy;

public class GameRoom implements Room {

    @Override
    public void enter(Player player) {
        System.out.println(player + " enters the game room.");
    }
}
