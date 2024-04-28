import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmojijiBezTeksta extends Poruka{

    private List<Emoji> emojiji;

    public EmojijiBezTeksta(String posiljalac) {
        super(posiljalac);
        this.emojiji = new ArrayList<>();
    }

    public List<Emoji> getEmojiji() {
        return emojiji;
    }

    public void setEmojiji(List<Emoji> emojiji) {
        this.emojiji = emojiji;
    }

    public void dodajEmojijeUPoruku(Emoji... emojis) {
        this.emojiji.addAll(Arrays.asList(emojis));
    }

    @Override
    protected String formirajSadrzinu() {

        StringBuilder sb = new StringBuilder();

        for (Emoji e : emojiji) {
            sb.append(e.getSkracenica());
            sb.append(" ");
        }

        return sb.toString();

    }
}
