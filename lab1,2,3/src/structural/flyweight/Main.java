package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        StickerFactory factory = new StickerFactory();
        ChatWindow chat = new ChatWindow();

        chat.addSticker(factory.getSticker(StickerType.SMILE), 0, 0);
        chat.addSticker(factory.getSticker(StickerType.HEART), 10, 10);
        chat.addSticker(factory.getSticker(StickerType.LAUGH), 20, 20);
        chat.addSticker(factory.getSticker(StickerType.SMILE), 30, 30); // той самий об’єкт
        chat.addSticker(factory.getSticker(StickerType.THUMBS_UP), 40, 40);
        chat.addSticker(factory.getSticker(StickerType.HEART), 50, 50); // той самий об’єкт

        chat.sendStickers();
    }
}
