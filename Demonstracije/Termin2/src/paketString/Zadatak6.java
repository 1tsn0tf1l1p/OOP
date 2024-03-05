package paketString;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        File fajl = new File("fajl.txt");

        try {
            Scanner sc =  new Scanner(fajl);

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Doslo je do grese.");
        }



    }
}
