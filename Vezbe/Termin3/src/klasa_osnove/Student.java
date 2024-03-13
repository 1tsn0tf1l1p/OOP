package klasa_osnove;

public class Student {

    // definisemo polja (atribute)
    // navodimo tip, i naziv polja
    // Ovako napisana polja su bez navedenog modifikatora vidljivosti
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private int godinaUpisa;
    private Smer smer;
    private String email;


    // Modifikatori su:
    // private - visljivo samo unutar klase
    // public - vidljivo svuda, na nivou projekta
    // protected - vidljivo na nivou paketa, i u podklasama

    // za klase - public, ili bez modifikatora

    /* Java Bean klasa (atributi private, pristupamo sa getterima i setterima */

    // Konstuktor - specijalna metoda koja se koristi za pravljenje konkretnih objekata
    // zove se isto kao klasa, ne navodi se povratni tip i moze da ima argumente
    // po default - bez konstruktora, imamo prazan konstruktor.
    // To znaci da mozemo da napravimo stuedenta koji nema nista (bez imena itd...)
    // Ukoliko napravimo studnta pomoci default constructora, njegovim poljima dodeljene su
    // defaultne vrednosti.

    // int double float (prosti tipovi, numericke vrednosti) - default: 0;
    // sve ostalo (string, enum..) - default: null;

    // Ako dodamo nas konstruktor, brise se default konstruktor, pa u tom slucaju ako nam treba
    // moramo sami da ga opet napravimo
    public Student(String ime, String prezime, int brojIndeksa, int godinaUpisa, Smer smer) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaUpisa = godinaUpisa;
        this.smer = smer;
        this.email = (ime.charAt(0)+prezime+brojIndeksa+brojIndeksa%100+smer+"@raf.rs").toLowerCase();
    }

    // Getter za uzimanje vrednosti, Setter za postavljanje

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // mozemo napraviti mejl:

    public void genersiMejl() {

        this.email = (ime.charAt(0)+prezime+brojIndeksa+brojIndeksa%100+smer+"@raf.rs").toLowerCase();


    }


    // metoda za svakog studenta da nam ispise o njemu sve
    public void info() {
        System.out.println(this.ime);
        System.out.println(this.prezime);
        System.out.println(this.brojIndeksa);
        System.out.println(this.godinaUpisa);
        System.out.println(this.smer);
        System.out.println(this.email);
    }
}
