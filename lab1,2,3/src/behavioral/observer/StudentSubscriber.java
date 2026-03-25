package behavioral.observer;

public class StudentSubscriber implements Subscriber {

    @Override
    public void update(VideoType videoType) {
        System.out.println("Student watches a " + videoType.description + " video.");
    }
}
