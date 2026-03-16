package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Room room = new GameRoomProxy(new GameRoom());

        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");
        Player p3 = new Player("Charlie");
        Player p4 = new Player("Diana");

        room.enter(p1);
        room.enter(p2);
        room.enter(p3);
        room.enter(p4); // буде заблокований проксі
    }
}
