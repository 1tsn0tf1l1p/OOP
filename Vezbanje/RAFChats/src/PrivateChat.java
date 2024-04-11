import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrivateChat implements Chat{

    private List<String> poruke;
    private Korisnik k1;
    private Korisnik k2;
    private Korisnik prethodniPosiljalac;

    public PrivateChat(Korisnik k1, Korisnik k2) {
        this.k1 = k1;
        this.k2 = k2;
        this.poruke = new ArrayList<>();
    }

    public List<String> getPoruke() {
        return poruke;
    }

    public void setPoruke(List<String> poruke) {
        this.poruke = poruke;
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

    /*
    - (2p) uslov u klasi PrivatniChat jeste da je pošiljalac k1 ili k2. Pomenuti korisnici poruke moraju
    slati naizmenično, što znači da ako je prethodni pošiljalac bio k2, sada poruku može slati samo k1, i
    obratno. Potrebno je, naravno, i ažurirati korisnika koji je prethodni poslao poruku (tj. treba
    ažurirati polje prethodniPosiljalac), tako da bude omogućeno pomenuto naizmenično slanje poruka.
    Prvi korisnik koji šalje poruku mora biti k1.
     */

    @Override
    public boolean mozeNapisatiPoruku(Korisnik korisnik) {

        //na pocetku prethodni je null
        if(prethodniPosiljalac == null){
            //tekst zadatka kaze da prviKorisnik salje prvu poruku
            if(Objects.equals(korisnik, k1)){
                prethodniPosiljalac = k1;
                return true;
            }
            //ako prethodni nije null
        } else{
            //ako korisnik koji je vec prethodnu poruku poslao zeli ponovo da posalje
            //mi mu nece dopustiti
            if(Objects.equals(prethodniPosiljalac, korisnik)){
                return false;
            }else{
                //ali ako je iduci korsnik onaj koji nije prethodni onda dopustamo
                prethodniPosiljalac = korisnik;
                return true;
            }
        }
        return false;
    }

    // - (0.5p) poruka se u PrivateChat dodaje samo pamćenjem poruke i prethodnog pošiljaoca.

    @Override
    public void dodajPoruku(Korisnik korisnik, String poruka) {

        this.poruke.add(poruka);
        this.prethodniPosiljalac = korisnik;

    }

}
