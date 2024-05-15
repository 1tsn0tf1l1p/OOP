package app.model;

import java.util.Objects;

public class Korisnik {

    private String ime;
    private String prezime;
    private String email;
    private String password;

    public Korisnik(String ime, String prezime, String email, String password) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Ime: " + this.ime + ", Prezime: " + this.prezime + ", Email: " + this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Korisnik korisnik = (Korisnik) o;
        return Objects.equals(email, korisnik.email);
    }
}
