package paketKlasa;

public class Student {

    private String ime;
    private String prezime;
    private String  indeks;

    void poloziIspit(){
        System.out.println("Polozio ispit!");
    }

    public Student(String ime, String prezime, String indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }
}
