public class Registracija {

    private Korisnik korisnik;
    private String confirmLozinka;

    public Registracija(Korisnik korisnik, String confirmLozinka) {
        this.korisnik = korisnik;
        this.confirmLozinka = confirmLozinka;
    }

    public boolean registrujKorisnika() {

        if(!this.korisnik.getLozinka().equals(confirmLozinka)) {
            return false;
        }
        if(Aplikacija.getRegistrovaniKorisnici().contains(korisnik)) {
            return false;
        }
        if(this.korisnik.getLozinka().length() < 8) {
            return false;
        }

        boolean malo = false;
        boolean veliko = false;
        boolean broj = false;

        char[] niz = this.korisnik.getLozinka().toCharArray();

        for(int i = 0; i < niz.length; i++) {
            if(niz[i] >= 'A' && niz[i] <= 'Z') {
                veliko = true;
            }
            if(niz[i] >= 'a' && niz[i] <= 'z') {
                malo = true;
            }
            if(niz[i] >= '0' && niz[i] <= '9') {
                broj = true;
            }
        }

        if(!(broj && malo && veliko)) {
            return false;
        }

        Aplikacija.getRegistrovaniKorisnici().add(korisnik);
        return true;

    }

    public boolean prijava(String korisnickoIme, String lozinka) {

        for(Korisnik k : Aplikacija.getRegistrovaniKorisnici()) {
            if(k.getKorisnickoIme().equals(korisnickoIme) && k.getLozinka().equals(lozinka)) {
                Aplikacija.getPrijavljeniKorisnici().add(korisnik);
                return true;
            }
        }

        return false;
    }

}
