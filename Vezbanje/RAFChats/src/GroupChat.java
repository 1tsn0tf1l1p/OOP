import java.util.ArrayList;
import java.util.List;

public class GroupChat implements Chat{

    private List<String> poruke;
    private List<Korisnik> grupa;
    private List<Korisnik> posiljaoci;

    public GroupChat() {
        this.poruke = new ArrayList<>();
        this.grupa = new ArrayList<>();
        this.posiljaoci = new ArrayList<>();
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
    }

    public List<Korisnik> getGrupa() {
        return grupa;
    }

    public void setGrupa(List<Korisnik> grupa) {
        this.grupa = grupa;
    }

    public List<Korisnik> getPosiljaoci() {
        return posiljaoci;
    }

    public void setPosiljaoci(List<Korisnik> posiljaoci) {
        this.posiljaoci = posiljaoci;
    }

    // - (1p) uslov u klasi GrupniChat jeste da je korisnik sadržan u grupi.

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return this.grupa.contains(korisnik);
    }

    /*
    - (1.5p) kada se poruka dodaje u GroupChat, u listi pošiljalaca pamti se ko ju je poslao, a u listi
    poruka sama poruka.
     */

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {

        this.posiljaoci.add(korisnik);
        this.poruke.add(poruka);

    }

    /*
    - (1p) dodavanje se implementira metodom dodajUGrupu i može se izvršiti samo ako korisnik još
    uvek ne postoji u grupi.
     */

    public void dodajUGrupu(Korisnik korisnik) {

        if(!this.grupa.contains(korisnik)) {
            this.grupa.add(korisnik);
        }

    }

    /*
    - (0.5p) metoda ukloniIzGrupe uklanja korisnika iz grupe.
     */

    public void ukloniIzGrupe(Korisnik korisnik) {

        this.grupa.remove(korisnik);

    }
}
