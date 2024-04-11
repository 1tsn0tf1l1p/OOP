import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Emojis {

    private List<Emoji> emojis;

    private static Emojis instance;

    public Emojis() {
        this.emojis = new ArrayList<>();
    }

    public static Emojis getInstance() {
        if(instance == null) {
            instance = new Emojis();
        }
        return instance;
    }

    public void setEmojis(List<Emoji> emojis) {
        this.emojis = emojis;
    }

    public List<Emoji> getEmojis() {
        return emojis;
    }

    /*
    - (1.5p) metoda dodajEmoji(naziv,skracenica) dodaje emoji u listu ako ne postoji emoji istog
    naziva ili iste skraćenice. Ukoliko je emoji dodat vraća true, u suprotnom false.
     */

    public boolean dodajEmoji(String naziv, String skracenica) {

        for (Emoji e : emojis) {
            if(e.getNaziv().equals(naziv) || e.getSkracenica().equals(skracenica)) {
                return false;
            }
        }

        Emoji emoji = new Emoji(naziv, skracenica);
        this.emojis.add(emoji);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emojis emojis1 = (Emojis) o;
        return Objects.equals(emojis, emojis1.emojis);
    }

}
