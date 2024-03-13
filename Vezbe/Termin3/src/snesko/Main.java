package snesko;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Ovde pravimo sim grudvanja

        Snesko snesko1 = new Snesko("Zoran", 5, 2);
        Snesko snesko2 = new Snesko("Goran", 2, 5);

        Snesko naPotezu = snesko1;
        Snesko meta = snesko2;

        Random random = new Random();

        while(!naPotezu.pobedjen()) {
            System.out.println("----------------------------");
            System.out.println("Na potezu: " + naPotezu.getNaziv());
            System.out.println("Meta: " + meta.getNaziv());

            double preciznost = random.nextDouble(); // random od 0 -1;

            if(preciznost >0.5) {
                System.out.println("Pogadja");
                naPotezu.pogodi(meta);
            }else{
                System.out.println("Promasio");
            }

            naPotezu.info();
            meta.info();

            Snesko tmp = naPotezu;
            naPotezu = meta;
            meta = tmp;
        }

        System.out.println("Pobednik: "+meta.getNaziv());

    }
}
