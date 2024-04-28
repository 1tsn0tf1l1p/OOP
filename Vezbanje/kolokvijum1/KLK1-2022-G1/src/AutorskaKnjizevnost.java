public class AutorskaKnjizevnost extends Knjizevnost{

    public int godina;
    public Pisac autor;

    public AutorskaKnjizevnost(String naziv, TipKnjizevnosti tipKnjizevnosti) {
        super(naziv, tipKnjizevnosti);
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Pisac getAutor() {
        return autor;
    }

    public void setAutor(Pisac autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return ",,"+getNaziv()+", Autor: "+getAutor()+"\"";
    }

    @Override
    public int compareTo(Knjizevnost o) {
        return 0;
    }
}
