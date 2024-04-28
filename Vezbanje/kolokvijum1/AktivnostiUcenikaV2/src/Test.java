import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Dnevnik d = new Dnevnik();

        Klasa k1 = new Klasa(Smer.PEKAR, 4, 6, "Micko");
        Klasa k2 = new Klasa(Smer.LEKAR, 2, 8, "Mladen");
        Klasa k3 = new Klasa(Smer.APOTEKAR, 8, 1, "Jefimija");

        Aktivnost a1 = new PraksaUApoteci("Praksa 1", Smer.APOTEKAR, 12, 12);
        Aktivnost a2 = new RadUPekari("Praksa 2", Smer.APOTEKAR, 12, 12);
        Aktivnost a3 = new Vizita("Praksa 3", Smer.APOTEKAR, 12, 12);

        Ucenik uk11 = new Ucenik("Pera", "Peric", "38429", k1);
        Ucenik uk12 = new Ucenik("Zora", "Mrki", "lsdkjdlsf23", k1);
        Ucenik uk13 = new Ucenik("Abdullah", "Mjhgke", "dlgndln34", k1);

        Ucenik uk21 = new Ucenik("Milica", "Zoranic", "347284729", k2);
        Ucenik uk22 = new Ucenik("Filip", "Cobanin", "8452398792745928", k2);
        Ucenik uk23 = new Ucenik("Darko", "Lazic", "ndsjkndskj23", k2);

        Ucenik uk31 = new Ucenik("Vaske", "Car", "4892492050923573985370498", k3);
        Ucenik uk32 = new Ucenik("Zarko", "Radenkovic", "340234820492308", k3);
        Ucenik uk33 = new Ucenik("Nikola", "Redzic", "89573895374958", k3);

        Beleska b1 = new Beleska(uk21, a1, 256, "Super je bio mali", 90, LocalDate.now());
        Beleska b2 = new Beleska(uk21, a1, 43, "Lose", 23, LocalDate.now());
        Beleska b3 = new Beleska(uk21, a1, 23452, "Odlican", 100, LocalDate.now());

        d.dodajAktivnost(a1);

        d.ispisAktivnosti();

        d.dodajBelesku(uk21, a2, 2123,"pedja", 1, LocalDate.now());

        d.obracunProsecneOceneSvihAktivnostiUcenika();


    }
}
