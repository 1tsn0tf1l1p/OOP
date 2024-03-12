package paket3;

public class Main {
    public static void main(String[] args) {

        Klijent k = new Klijent("Pera", "Peric", "123");

        Racun r = new Racun("123", 2000);

        Banka b = new Banka("NLB", "Beograd");

        b.dodajKlijenta(k);

        k.setRacun(r);

        r.isplata(1000);

        System.out.println(r.isplata(1000));

    }
}
