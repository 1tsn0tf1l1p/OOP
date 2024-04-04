import java.util.ArrayList;
import java.util.List;

public class Registracija {

    private List<Korisnik> registrovani;
    private List<Korisnik> prijavljeni;

    public Registracija() {
        this.prijavljeni = new ArrayList<>();
        this.registrovani = new ArrayList<>();
    }

    public List<Korisnik> getRegistrovani() {
        return registrovani;
    }

    public void setRegistrovani(List<Korisnik> registrovani) {
        this.registrovani = registrovani;
    }

    public List<Korisnik> getPrijavljeni() {
        return prijavljeni;
    }

    public void setPrijavljeni(List<Korisnik> prijavljeni) {
        this.prijavljeni = prijavljeni;
    }

    public boolean registrujKorisnika(String prikaznoIme, String korisnickoIme, String lozinka1, String lozinka2) {
        if(!lozinka1.equals(lozinka2)) {
            return false;
        }
        for(Korisnik k:registrovani) {
            if(k.getKorisnickoIme().equals(korisnickoIme)) {
                return false;
            }
        }
        if(lozinka1.length() < 8) {
            return false;
        }

        boolean nasaoMalo = false;
        boolean nasaoVeliko = false;
        boolean nasaoBroj = false;

        for(char c:lozinka1.toCharArray()) {
            if(c>='0' && c<='9') {
                nasaoBroj = true;
            }
            if(c>='A' && c<='Z') {
                nasaoVeliko = true;
            }
            if(c>='a' && c<='z') {
                nasaoMalo = true;
            }
        }

        if(!(nasaoMalo && nasaoVeliko && nasaoBroj)) {
            return false;
        }

        Korisnik k = new Korisnik(prikaznoIme, korisnickoIme, lozinka1);

        registrovani.add(k);
        System.out.println("Registrovani korisnik pod imenom "+korisnickoIme);

        return true;

    }

    public void prijavaKorisnika(String korisnickoIme, String lozinka) {

        Korisnik prijavljeniKorisnik = null;

        for(Korisnik k:prijavljeni) {
            if(k.getKorisnickoIme().equals(korisnickoIme)) {
                if(k.getLozinka().equals(lozinka)) {
                    prijavljeniKorisnik = k;
                    break;
                }else {
                    System.out.println("Netacna lozinka");
                    return;
                }
            }
        }
        if(prijavljeniKorisnik == null){
            System.out.println("Korisnik sa korisnickim imenom: " + korisnickoIme + " nije registrovan!");
            return;
        }

        if(!prijavljeni.contains(prijavljeniKorisnik)){
            System.out.println("Uspesno prijavljeni!");
            this.prijavljeni.add(prijavljeniKorisnik);
        }

    }

}
