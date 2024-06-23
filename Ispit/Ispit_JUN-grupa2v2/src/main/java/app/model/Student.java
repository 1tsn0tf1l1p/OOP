package app.model;

import java.util.Map;
import java.util.Objects;

public class Student {
    private String prezime;
    private String ime;
    private String email;
    private String termin;
    private Map<Pitanje, Double> osvojeniPoeni;
    private Double poeniUml;
    private Double poeniMoodle;
    private Double ukupno;

    public Student(String prezime, String ime, String email, String termin, Map<Pitanje, Double> osvojeniPoeni) {
        this.prezime = prezime;
        this.ime = ime;
        this.email = email;
        this.termin = termin;
        this.osvojeniPoeni = osvojeniPoeni;
        this.poeniUml = 0.0;
        izracunajPoeneMoodle();
        izracunajUkupno();
    }

    private void izracunajUkupno() {
        this.ukupno = this.poeniMoodle + this.poeniUml;
    }

    private void izracunajPoeneMoodle() {
        double zbir = 0;
        for (Map.Entry<Pitanje, Double> entry : osvojeniPoeni.entrySet()) {
            zbir += entry.getValue();
        }
        this.poeniMoodle = zbir;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public Map<Pitanje, Double> getOsvojeniPoeni() {
        return osvojeniPoeni;
    }

    public void setOsvojeniPoeni(Map<Pitanje, Double> osvojeniPoeni) {
        this.osvojeniPoeni = osvojeniPoeni;
    }

    public Double getPoeniUml() {
        return poeniUml;
    }

    public void setPoeniUml(Double poeniUml) {
        this.poeniUml = poeniUml;
    }

    public Double getPoeniMoodle() {
        return poeniMoodle;
    }

    public void setPoeniMoodle(Double poeniMoodle) {
        this.poeniMoodle = poeniMoodle;
    }

    public Double getUkupno() {
        return ukupno;
    }

    public void setUkupno(Double ukupno) {
        this.ukupno = ukupno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(prezime, student.prezime) && Objects.equals(ime, student.ime) && Objects.equals(email, student.email) && Objects.equals(osvojeniPoeni, student.osvojeniPoeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prezime, ime, email, osvojeniPoeni);
    }

    @Override
    public String toString() {
        return "Student{" +
                "prezime='" + prezime + '\'' +
                ", ime='" + ime + '\'' +
                ", email='" + email + '\'' +
                ", osvojeniPoeni=" + osvojeniPoeni +
                '}';
    }
}
