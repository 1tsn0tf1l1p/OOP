package paket1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();

        lista1.add("Poslovne Aplikacije");
        lista1.add("OOP");
        lista1.add("UUP");

        lista1.add(2, "Engleski 1");

        lista1.set(1, "Srpski jezik");

        System.out.println(lista1.get(2));

        lista1.remove(3);

        ArrayList <String> lista2 = new ArrayList<>();

        lista2.add("Poslovne Aplikacije");
        lista2.add("Srpski jezik");

        lista1.removeAll(lista2);

        for(String p:lista1){
            System.out.println(p);
        }

    }
}
