package paketString;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        int niz[] = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
        }

        for(int i:niz){
            System.out.println(i);
        }
    }
}
