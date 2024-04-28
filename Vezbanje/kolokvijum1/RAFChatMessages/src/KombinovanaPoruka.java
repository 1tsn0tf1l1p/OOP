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
            sadrzina.add(poruka);
        }
        else {
            ((KombinovanaPoruka) poruka).getSadrzina().addAll(sadrzina);
        }

    }

    @Override
    protected String formirajSadrzinu() {

        StringBuilder sb = new StringBuilder();

        for(Poruka p:sadrzina) {
            if(p instanceof TekstualnaPoruka) {
                sb.append(((TekstualnaPoruka) p).getTekst());
                sb.append(" ");
            }
            else if(p instanceof EmojiPoruka){
                sb.append(((EmojiPoruka) p).getEmoji());
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
