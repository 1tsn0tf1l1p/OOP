package forwhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Forwhile {

    public static void main(String[] args) {

        // 1. Korisnik unosi mesec i godinu kao int, ispisati koliko taj mesec ima dana.

        /*

        Scanner scanner = new Scanner(System.in);

        int g = scanner.nextInt();
        int m = scanner.nextInt();

        switch (m){

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                break;

            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                if(g % 400 == 0 || (g % 4 == 0 && g % 100 != 0)){
                    System.out.println(29);
                }else{
                    System.out.println(28);
                }
                break;
        }

    }

         */

        // Samo sa stringom

        // case: "jaunar" case: " april" ...

        Mesec mojMesec = Mesec.AVGUST;
        System.out.println(mojMesec);

        // redni broj

        System.out.println(mojMesec.ordinal());

        // u string

        System.out.println(mojMesec.name());

        // nizovi:

        int niz[] = new int[10]; // prvo tip i naziv sa oznakama, definisemo sa new tip koji se cuva u nizu i velicina
        // u uglastim zagradama;

        // klasicna for petlja ista je kao i u C

        for(int i = 0; i<niz.length; i++){

            niz[i] = i+1;

        }

        for (int i = 0; i < niz.length; i++) {

            System.out.println(niz[i]);

        }

        // Pored ove for petlje imamo i FOR EACH koja se cesce koristi
        // unutar zagrada navodi se tip podataka koji se cuva u nizu (int)
        // posle toga se navodi naziv promenjljive koja ima taj tip naveden pre nje
        //int i
        //zatim sledi : kojom se definisanje odvaja od same kolekcije kroz koju iterjuemo.
        // niz je kolekcija brojeva
        // U svakoj iteracije odgovarajuci broj smesta se u promelnjljivu i
        // U prvoj iteraciji smestice se u niz[0]

        for(int i:niz){
            System.out.println(i);
        }

        // U enumu izlistati sve vrednosti

        Mesec[] nizMeseci = Mesec.values();

        for(Mesec m:nizMeseci){
            System.out.println(m);
        }

        // Korisnk unosi broj, ispisati obrnuti broj

        // URADI GA



    }

}
