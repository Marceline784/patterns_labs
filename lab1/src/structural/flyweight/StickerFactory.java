package structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class StickerFactory {

    private final Map<StickerType, Sticker> stickers = new EnumMap<>(StickerType.class);

    public Sticker getSticker(StickerType type) {
        Sticker sticker = stickers.get(type);
        if (sticker == null) {
            switch (type) {
                case SMILE -> sticker = new SmileSticker();
                case HEART -> sticker = new HeartSticker();
                case LAUGH -> sticker = new LaughSticker();
                case THUMBS_UP -> sticker = new ThumbsUpSticker();
            }
            stickers.put(type, sticker);
        }
        return sticker;
    }
}
