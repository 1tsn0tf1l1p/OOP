import java.util.ArrayList;
import java.util.List;

public class KombinovanaPoruka extends Poruka{

    private List<Poruka> sadrzina;

    public KombinovanaPoruka(String posiljalac) {
        super(posiljalac);
        this.sadrzina = new ArrayList<>();
    }

    public List<Poruka> getSadrzina() {
        return sadrzina;
    }

    public void setSadrzina(List<Poruka> sadrzina) {
        this.sadrzina = sadrzina;
    }

    public void dodajUSadrzinu(Poruka poruka) {

        if(!this.getPosiljalac().equals(poruka.getPosiljalac())) {
            return;
        }

        if(!(poruka instanceof KombinovanaPoruka)) {
            this.sadrzina.add(poruka);
        }
        if(poruka instanceof KombinovanaPoruka) {
            this.sadrzina.addAll(((KombinovanaPoruka) poruka).getSadrzina());
        }

    }

    /*
    - (1p) u klasi KombinovanaPoruka vraća se tekst dobijen od sadrzine poruke (koju čine druge
    poruke). U tom tekstu nalaze se sve poruke iz sadrzine, razdvojene razmakom (spejs).
     */

    @Override
    protected String formirajSadrzinu() {

        StringBuilder sb = new StringBuilder();

        for (Poruka poruka : sadrzina) {
            if(poruka instanceof TekstualnaPoruka) {
                sb.append(((TekstualnaPoruka) poruka).getTekst());
                sb.append(" ");
            }
            if(poruka instanceof EmojiPoruka) {
                sb.append(((EmojiPoruka) poruka).getEmoji().getSkracenica());
                sb.append(" ");
            }
            if(poruka instanceof EmojijiBezTeksta) {
                for(Emoji e : ((EmojijiBezTeksta) poruka).getEmojiji()) {
                    EmojiPoruka ep = new EmojiPoruka(this.getPosiljalac(), e);
                    this.sadrzina.add(ep);
                }
            }
        }

        return sb.toString();

    }
}
