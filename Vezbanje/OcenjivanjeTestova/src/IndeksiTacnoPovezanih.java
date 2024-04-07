import java.util.ArrayList;
import java.util.List;

public class IndeksiTacnoPovezanih {

    private int indeksPrveKolone;
    private List<Integer> indeksiDrugeKolone;

    public IndeksiTacnoPovezanih(int indeksPrveKolone, List<Integer> indeksiDrugeKolone) {
        this.indeksPrveKolone = indeksPrveKolone;
        this.indeksiDrugeKolone = new ArrayList<>();
    }

    public int getIndeksPrveKolone() {
        return indeksPrveKolone;
    }

    public void setIndeksPrveKolone(int indeksPrveKolone) {
        this.indeksPrveKolone = indeksPrveKolone;
    }

    public List<Integer> getIndeksiDrugeKolone() {
        return indeksiDrugeKolone;
    }

    public void setIndeksiDrugeKolone(List<Integer> indeksiDrugeKolone) {
        this.indeksiDrugeKolone = indeksiDrugeKolone;
    }
}
