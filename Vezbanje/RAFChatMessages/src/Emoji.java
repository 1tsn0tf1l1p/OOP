import java.util.Objects;

public class Emoji {

    private String naziv;
    private String skracenica;

    public Emoji(String naziv, String skracenica) {
        this.naziv = naziv;
        this.skracenica = skracenica;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSkracenica() {
        return skracenica;
    }

    public void setSkracenica(String skracenica) {
        this.skracenica = skracenica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emoji emoji = (Emoji) o;
        return Objects.equals(naziv, emoji.naziv) && Objects.equals(skracenica, emoji.skracenica);
    }

}
