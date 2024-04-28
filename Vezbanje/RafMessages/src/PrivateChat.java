import java.util.ArrayList;
import java.util.List;

public class PrivateChat implements Chat{

    private Korisnik k1;
    private Korisnik k2;
    private Korisnik prethodniPosiljalac;
    private List<String> poruke;

    public PrivateChat(Korisnik k1, Korisnik k2) {
        this.k1 = k1;
        this.k2 = k2;
        this.prethodniPosiljalac = this.k2;
        this.poruke = new ArrayList<>();
    }

    public Korisnik getK1() {
        return k1;
    }

    public void setK1(Korisnik k1) {
        this.k1 = k1;
    }

    public Korisnik getK2() {
        return k2;
    }

    public void setK2(Korisnik k2) {
        this.k2 = k2;
    }

    public Korisnik getPrethodniPosiljalac() {
        return prethodniPosiljalac;
    }

    public void setPrethodniPosiljalac(Korisnik prethodniPosiljalac) {
        this.prethodniPosiljalac = prethodniPosiljalac;
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {

        if(this.prethodniPosiljalac == this.k1) {
            if(this.k2.equals(korisnik)) {
                this.prethodniPosiljalac = this.k2;
                return true;
            }
            else {
                return false;
            }
        }

        if(this.k1.equals(korisnik)) {
            this.prethodniPosiljalac = this.k1;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {
        this.poruke.add(poruka);
    }
}
