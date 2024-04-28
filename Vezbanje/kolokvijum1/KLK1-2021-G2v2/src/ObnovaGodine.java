import java.util.List;

public class ObnovaGodine extends AktivnostStudenta{

    private int godinaObnove;
    private List<Predmet> predmetiKojeUpisuje;

    public ObnovaGodine(int godina, int mesec, int dan, List<Predmet> predmetiKojeUpisuje) {
        super(godina, mesec, dan);
        this.predmetiKojeUpisuje = predmetiKojeUpisuje;
    }


    @Override
    public int getGodinaStudija() {
        return godinaObnove;
    }

    @Override
    public boolean proveriUslov(Student student) {
        // TODO
    }
}
