package behavioral.observer;


public class Main {
    public static void main() {

        Channel channel = new Channel();

        Subscriber s1 = new StudentSubscriber();
        Subscriber s2 = new BloggerSubscriber();
        Subscriber s3 = new GamerSubscriber();

        channel.addSubscriber(s1);
        channel.addSubscriber(s2);
        channel.addSubscriber(s3);

        channel.uploadVideo(VideoType.VLOG);
        channel.uploadVideo(VideoType.TUTORIAL);
    }
}
