import java.util.ArrayList;
import java.util.List;

public class ObnovaGodine extends AktivnostStudenta{

    private int godinaObnove;
    private List<Predmet> predmetiKojeUpisuje;

    public ObnovaGodine(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
        this.predmetiKojeUpisuje = new ArrayList<>();
    }

    public int getGodinaObnove() {
        return godinaObnove;
    }

    public void setGodinaObnove(int godinaObnove) {
        this.godinaObnove = godinaObnove;
    }

    public List<Predmet> getPredmetiKojeUpisuje() {
        return predmetiKojeUpisuje;
    }

    public void setPredmetiKojeUpisuje(List<Predmet> predmetiKojeUpisuje) {
        this.predmetiKojeUpisuje = predmetiKojeUpisuje;
    }

    @Override
    public int getGodinaStudija() {
        return super.getGodina();
    }

    @Override
    public boolean proveriUslov(Student student) {
        for(AktivnostStudenta as:student.getAktivnosti()) {
            if(as instanceof UpisGodine) {
                if(((UpisGodine) as).getGodinaKojuUpisuje() == godinaObnove) {
                    return true;
                }
            }
            else {
                return false;
            }
        }

        return true;
    }
}
