package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ChatWindow {

    private final List<StickerInstance> stickers = new ArrayList<>();

    public void addSticker(Sticker sticker, int x, int y) {
        stickers.add(new StickerInstance(sticker, x, y));
    }

    public void sendStickers() {
        for (StickerInstance instance : stickers) {
            instance.sticker.send(instance.x, instance.y);
        }
    }

    private static class StickerInstance {
        private final Sticker sticker;
        private final int x;
        private final int y;

        public StickerInstance(Sticker sticker, int x, int y) {
            this.sticker = sticker;
            this.x = x;
            this.y = y;
        }
    }
}
