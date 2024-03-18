package fakultet;

public class Main {
    public static void main(String[] args) {
        // kreiramo grupu,
        // kreiramo studente
        // dodamo studente u grupu
        // odrzimo ispit
        // prosek i prepisivace pogledati

        Grupa grupa1 = new Grupa("106");

        Student s1 = new Student("Pera", "Peric", TipStudenta.NIJE_PREPISIVAC, "1RN");
        Student s2 = new Student("Marko", "Markovic", TipStudenta.PREPISIVAC, "2RN");
        Student s3 = new Student("Misa", "Misic", TipStudenta.PREPISIVAC, "43RN");
        Student s4 = new Student("Radoslav", "Mitic", TipStudenta.NIJE_PREPISIVAC, "4RN");
        Student s5 = new Student("Anja", "Mikic", TipStudenta.PREPISIVAC, "6RN");

        grupa1.dodajStudenta(s1);
        grupa1.dodajStudenta(s2);
        grupa1.dodajStudenta(s3);
        grupa1.dodajStudenta(s4);
        grupa1.dodajStudenta(s5);

        // odrzi ispit

        grupa1.odrziIspit();

        grupa1.ispisiStudente();

    }
}
