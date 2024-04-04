import java.util.ArrayList;
import java.util.List;

public class PitanjeSlobodanOdgovor extends Pitanje{

    private List<String> kljucneReci;

    public PitanjeSlobodanOdgovor(String tekstPitanja) {
        super(tekstPitanja);
        this.kljucneReci = new ArrayList<>();
    }

    public List<String> getKljucneReci() {
        return kljucneReci;
    }

    public void setKljucneReci(List<String> kljucneReci) {

        if(this.kljucneReci.size()!=this.getBrojPoena()) {
            return;
        }

        this.kljucneReci = kljucneReci;
    }

    @Override
    public int brojPoena(String odgovor) {

        String[] niz = odgovor.split("[, .]");

        List<String> pogodjeneReci = new ArrayList<>();

        int poeni = 0;

        for(int i = 0; i<kljucneReci.size(); i++){
            for(String s:niz) {
                if(s.equals(kljucneReci.get(i)) && !pogodjeneReci.contains(s)) {
                    poeni++;
                    pogodjeneReci.add(s);
                }
            }
        }

        return poeni;


    }
}
