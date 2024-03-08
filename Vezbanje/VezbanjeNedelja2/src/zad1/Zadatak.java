package zad1;

import java.util.Scanner;

public class Zadatak {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("Kako se zoves?");
        String ime = sc.nextLine();

        System.out.println("Koliko godina imas?");
        int god = sc.nextInt();

        sb.append("Zoves se "+ime+" i imas "+god);

        System.out.println(sb);

    }



}
