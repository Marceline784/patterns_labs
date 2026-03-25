package behavioral.observer;

public class GamerSubscriber implements Subscriber {

    @Override
    public void update(VideoType videoType) {
        System.out.println("Gamer is interested in the " + videoType.description + " video.");
    }
}
