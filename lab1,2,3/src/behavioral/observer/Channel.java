package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private VideoType currentVideo;

    private final List<Subscriber> subscribers;

    public Channel() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber sub) {
        subscribers.add(sub);
    }

    public void removeSubscriber(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void uploadVideo(VideoType type) {
        currentVideo = type;
        System.out.println("Channel uploaded a new " + type.description + " video.");
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(currentVideo);
        }
    }
}
