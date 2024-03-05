package paketString;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ocena = sc.nextInt();

        switch (ocena){

            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Okej");
                break;
            case 4:
                System.out.println("Vrlodobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
        }

    }

}
