import snesko.Snesko;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Snesko s1 = new Snesko("Goran", 13, 100);
        Snesko s2 = new Snesko("Marko", 11, 100);

        int randomNumber = random.nextInt();

        Snesko naPotezu = s1;
        Snesko meta = s2;

        while(naPotezu.siZiv()) {
            System.out.println("---------------------------------");
            // ispisujemo ko koga gadja
            System.out.println(naPotezu.getNaziv() + " gadja "  + meta.getNaziv());

            double precizan = random.nextDouble();
            System.out.println("preciznost: " + precizan);
            if (precizan > 0.5) {
                System.out.println("pogodio");
                // gadja metu
                naPotezu.gadjaj(meta);
            } else {
                System.out.println("promasio");
            }

            // ispisujemo vrednosti svih polja

            System.out.println("---------------------------------");

            // nakon tog jednog gadjanja, sada je meta na redu da gadja
            // menjamo ko je na potezu
            Snesko temp = naPotezu;
            naPotezu = meta;
            meta = temp;
        }


    }
}
