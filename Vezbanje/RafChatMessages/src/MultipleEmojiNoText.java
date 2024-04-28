import java.util.ArrayList;
import java.util.List;

public class MultipleEmojiNoText extends Poruka{

    private List<Emoji> emojiList;
    private List<Poruka> sadrzina;

    public MultipleEmojiNoText(String posiljalac) {
        super(posiljalac);
        this.emojiList = new ArrayList<>();
        this.sadrzina = new ArrayList<>();
    }

    public List<Emoji> getEmojiList() {
        return emojiList;
    }

    public void setEmojiList(List<Emoji> emojiList) {
        this.emojiList = emojiList;
    }

    @Override
    protected String formirajSadrzinu() {

        StringBuilder sb = new StringBuilder();

        for(Emoji e:emojiList) {
            sb.append(e.getSkracenica()).append(" ");
        }

        return sb.toString();

    }
}
