import java.util.ArrayList;
import java.util.List;

public class Aplikacija {

    private static List<Korisnik> registrovaniKorisnici;
    private static List<Korisnik> prijavljeniKorisnici;


    public Aplikacija() {
        registrovaniKorisnici = new ArrayList<>();
        prijavljeniKorisnici = new ArrayList<>();
    }

    public static List<Korisnik> getRegistrovaniKorisnici() {
        return registrovaniKorisnici;
    }

    public static void setRegistrovaniKorisnici(List<Korisnik> registrovaniKorisnici) {
        Aplikacija.registrovaniKorisnici = registrovaniKorisnici;
    }

    public static List<Korisnik> getPrijavljeniKorisnici() {
        return prijavljeniKorisnici;
    }

    public static void setPrijavljeniKorisnici(List<Korisnik> prijavljeniKorisnici) {
        Aplikacija.prijavljeniKorisnici = prijavljeniKorisnici;
    }
}
