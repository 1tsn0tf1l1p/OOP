package stringovi.metode;

public class string {

    public static void main(String[] args) {

        // Strinogvi su imutabilni (nepromenljivi)

        String str = "Danas je ";

        // + kao konkatenator (ili metoda str.concat())

        str = str.concat("ponedeljak");
        System.out.println(str);

        // StringBuilder - klasa (preporuka da se koristi prilikom izgradnje stringova
        // od vise drugih podataka umesto concat metode

        StringBuilder sb = new StringBuilder();

        // append dodaje na objekat sb podatke koje ste prosledili
        // ti podaci su: str, int, float..
        // append je MUTABILNA metoda (moze da se menja, menja se jedan objekat)

        sb.append("Ja sam Filip.");
        sb.append("Moj indeks je 56.");
        sb.append("Test.");

        System.out.println(sb.toString());



    }

}
