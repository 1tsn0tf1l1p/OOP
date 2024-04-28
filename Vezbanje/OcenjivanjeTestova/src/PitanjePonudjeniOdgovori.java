import java.util.ArrayList;
import java.util.List;

public class PitanjePonudjeniOdgovori extends Pitanje{

    private List<String> ponudjeniOdgovori;
    private List<Integer> indeksiTacnih;

    public PitanjePonudjeniOdgovori(String tekstPitanja) {
        super(tekstPitanja);
        this.ponudjeniOdgovori = new ArrayList<>();
        this.indeksiTacnih = new ArrayList<>();
    }

    public void dodajPonudjeniOdgovor(String odgovor, boolean tacnostOdgovora) {

        for(String s:ponudjeniOdgovori) {
            if(s.equals(odgovor)) {
                return;
            }
        }

        if(this.indeksiTacnih.size()>this.getBrojPoena()) {
            return;
        }

        this.ponudjeniOdgovori.add(odgovor);

        if(tacnostOdgovora) {
            this.indeksiTacnih.add(this.ponudjeniOdgovori.size()+1);
        }

    }

    public List<String> getPonudjeniOdgovori() {
        return ponudjeniOdgovori;
    }

    public void setPonudjeniOdgovori(List<String> ponudjeniOdgovori) {
        this.ponudjeniOdgovori = ponudjeniOdgovori;
    }

    public List<Integer> getIndeksiTacnih() {
        return indeksiTacnih;
    }

    public void setIndeksiTacnih(List<Integer> indeksiTacnih) {
        this.indeksiTacnih = indeksiTacnih;
    }

    @Override
    public int brojPoena(String s) {

        String[] niz = s.split(",");

        int poeni = 0;
        for(int cnt = 0; cnt<indeksiTacnih.size(); cnt++){
            for(String izvucenOdgovor:niz) {
                if(izvucenOdgovor.equals(ponudjeniOdgovori.get(indeksiTacnih.get(cnt)))) {
                    poeni++;
                    break;
                }
            }
        }

        return poeni;
    }
}
