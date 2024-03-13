package klasa_osnove;

public class Main {
    public static void main(String[] args) {

        // klasa - sablon na osnovu koga se pravi konkretan objekat
        // Objekat je instanca klase

        // Student recimo klasa - sta ga karakterise
        // to definisemo u klasi jer ona predstavlja sablon

        // Student:
        // Ime, prezime, broj indeka, godina upsia, smer, email
        // Konkretan student: Filip Cobanin, 56, 2023, RI, fcobanin5623ri@raf.rs


        // pravimo ga sa new i zovemo konstruktor
        Student s = new Student("Pera", "Peric", 23, 2023, Smer.RN);

        // ispis podataka za Studenta s.

        if(s.getEmail() == null) {
            s.genersiMejl();
        }


    }
}
