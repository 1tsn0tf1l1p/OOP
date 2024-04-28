import java.util.ArrayList;
import java.util.List;

public class Emojis {

    private List<Emoji> emojis;
    private static Emojis instance;

    private Emojis() {
        this.emojis = new ArrayList<>();
    }

    public static Emojis getInstance() {
        if(instance == null) {
            instance = new Emojis();
        }
        return instance;
    }

    public List<Emoji> getEmojis() {
        return emojis;
    }

    public boolean dodajEmoji(String naziv, String skracenica) {

        for(Emoji e:emojis) {
            if(e.getNaziv().equals(naziv) || e.getSkracenica().equals(skracenica)) {
                return false;
            }
        }

        Emoji newEmoji = new Emoji(naziv, skracenica);
        emojis.add(newEmoji);

        return true;
    }


}
