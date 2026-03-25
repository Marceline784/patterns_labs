package behavioral.observer;

public class BloggerSubscriber implements Subscriber {

    @Override
    public void update(VideoType videoType) {
        System.out.println("Blogger reacts to a " + videoType.description + " video.");
    }
}
