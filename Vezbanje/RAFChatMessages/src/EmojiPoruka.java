public class EmojiPoruka extends Poruka{

    private Emoji emoji;

    public EmojiPoruka(String posiljalac, Emoji emoji) {
        super(posiljalac);
        this.emoji = emoji;
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    // - (0.5p) u klasi EmojiPoruka opisana metoda vraća skracenicu emoji-ja

    @Override
    protected String formirajSadrzinu() {
        return this.emoji.getSkracenica();
    }
}
