import java.util.Objects;

public class NajcitanijiPisac {

    private Pisac pisac;
    private int brojDela;

    public NajcitanijiPisac(Pisac pisac, int brojDela) {
        this.pisac = pisac;
        this.brojDela = brojDela;
    }

    public Pisac getPisac() {
        return pisac;
    }

    public void setPisac(Pisac pisac) {
        this.pisac = pisac;
    }

    public int getBrojDela() {
        return brojDela;
    }

    public void setBrojDela(int brojDela) {
        this.brojDela = brojDela;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NajcitanijiPisac that = (NajcitanijiPisac) o;
        return Objects.equals(pisac, that.pisac);
    }



}
