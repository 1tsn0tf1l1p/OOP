import java.util.ArrayList;
import java.util.List;

public class Server {

    private static Server server;
    private List<Korisnik> korisnici = new ArrayList<>();

    private Server() {
    }

    public static Server getServer() {
        if(server == null) {
            server = new Server();
        }
        return server;
    }

    public Korisnik getKorisnikByKorisnickoIme(String korsnickoIme) {
        for (Korisnik korisnik : korisnici) {
            if(korisnik.getKorisnickoIme().equals(korsnickoIme)) {
                return korisnik;
            }

        }

        return null;
    }

    private boolean sadrziCifru(String lozinka, char cifra) {
        return lozinka.contains("" + cifra);
    }



    public Korisnik registruj(String prikaznoIme, String korisnickoIme, String lozinka, String confirm) {
        if(!lozinka.equals(confirm)) {
            return null;
        }
        if(this.getKorisnikByKorisnickoIme(korisnickoIme) != null) {
            return  null;
        }
        if(lozinka.length() < 8) {
            return null;
        }

    }

}
