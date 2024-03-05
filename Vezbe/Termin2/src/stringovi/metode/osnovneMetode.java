package stringovi.metode;

public class osnovneMetode {

    public static void main(String[] args) {

        String str = "danas je ponedeljka  ";
        String podstring = "Pon";
        String podstring2 = "PON";

        // duzina stringa

        System.out.println(str.length());

        // prebaciti u mala slova

        System.out.println(str.toLowerCase());

        // prebaciti u velika

        System.out.println(str.toUpperCase());

        // da l istring sadrzi u sebi podstring

        System.out.println(str.contains(podstring));

        // prazana str je podrsting svakog stringa

        // Ovako proveravamo sadrzaj stringova da li se podudara:

        System.out.println(str.toLowerCase().contains(podstring.toLowerCase()));

        // Proveravamo sadrzaj

        System.out.println(podstring2.equals(podstring));
        System.out.println(podstring2.equalsIgnoreCase(podstring));

        // Kako mozemo da dohvatimo karakter na odrednjenom indeksu

        System.out.println("Karakter na indesku 9 je: " + str.charAt(9));

        // skinuti space sa pocetka i kraja stringa

        System.out.println(str.trim());

        // kako da uzmemo podrstring?

        System.out.println("Podstring od indeksa 4 do 10 je " + str.substring(4, 10));

        // Metoda za zamenu karaktera u stringu drugim karakterom

        System.out.println(str.replaceAll("a", "#"));
        System.out.println(str.replace("a", "#"));



        // REGEX za proveru validnosti rafovog maila
        // fcobanin5623ri@raf.rs

        /*
        prvo mala slova (ima ih vise)
        broj indeksa ( min 1 cifra, max 3 cifre)
        godina upisa 2 cifre
        rn, ri, rm - svi pocinju na r, onda ili n, ili m ili i
        @raf.rs
         */

        /*

        [a-z] - ovo je regex za jedan karakter kojij e malo slovo
        ako cemo vise malih slova, pored [a-z] stavljamo + ili *,
        plus znaci min jedno pojavljivanje ili vise, a * ne mora a moze i ivse
        puta da se ponovi
        [a-z]+
        ako spojim indeks i godinu uoisa, min cif je 3, max 5
        [0-9] - ovo je regex za jednu cifru od 0-9
        [0-9]+

        {3,5} - ocekujem da se pojavi minimum 3 puta, maks 5
        {3} - tanco 3
        r - sigurno dolazi nakon godine upisa
        zatim dolazi neki karakter: n, m , i
        [nmi] - moze doci jedan karakter koji je n, m ili i
        ukoliko ne mora nmi da postoji, tj imamo smer racunarstvo (r)
        ? - opciono, moze se javiti jednom ili nijednom
        . - na tom mestu moze da se nadje bilo koji karakter, ukoliko
        hocemo bas tacku,  treba \\.

         */

        String regex = "[a-z]+[0-9]{3,5}r[nmi]?@raf\\.rs";
        String email = "fcobanin5623ri@raf.rs";

        System.out.println(email.matches(regex));

    }

}
