import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void dodajUGrupu(Korisnik korisnik) {
        if(!grupa.contains(korisnik)) {
            grupa.add(korisnik);
        }
    }

    public void ukloniIzGrupe(Korisnik korisnik) {
        grupa.remove(korisnik);
    }

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {
        return !grupa.contains(korisnik);
    }

    @Override
    public void dodajPoruku(Korisnik korisnik, String s) {

        posiljaoci.add(korisnik);
        poruke.add(s);

    }

}
