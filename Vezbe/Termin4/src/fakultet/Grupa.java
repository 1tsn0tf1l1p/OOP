package fakultet;

import java.util.ArrayList;

public class Grupa {

    private String naziv;
    private ArrayList<Student> studenti;

    public Grupa(String naziv) {
        this.naziv = naziv;
        // inicijalizujemo listu
        this.studenti = new ArrayList<>();
    }

    public void odrziIspit() {
        for(Student s:studenti) {
            s.radiIspit();
        }
    }

    public void ispisiStudente() {
        for(Student s:studenti) {
            s.info();
        }
    }

    public void dodajStudenta(Student s) {
        if(studenti == null){
            studenti = new ArrayList<>();
        }
        studenti.add(s);
    }

    public double prosekPoenaNaIspitu() {
        double sumaPoena = 0;
        for(Student s:studenti) {
            sumaPoena += s.getBrojPoenaNaIspitu();
        }

        // broj studenata dobijamo pomocu velicine liste

        return sumaPoena/studenti.size();
    }

    public int brojStudenataKojiSuPrepisivali() {
        int prepisivaci = 0;
        for(Student s:studenti) {
            prepisivaci++;
        }

        return prepisivaci;
    }

}
