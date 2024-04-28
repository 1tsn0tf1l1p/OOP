import java.util.ArrayList;
import java.util.List;

public class UpisGodine extends AktivnostStudenta{

    private int godinaKojuUpisuje;
    private List<Predmet> prenetiPredmeti;

    public UpisGodine(int godina, int mesec, int dan) {
        super(godina, mesec, dan);
        this.prenetiPredmeti = new ArrayList<>();
    }

    public int getGodinaKojuUpisuje() {
        return godinaKojuUpisuje;
    }

    public void setGodinaKojuUpisuje(int godinaKojuUpisuje) {
        this.godinaKojuUpisuje = godinaKojuUpisuje;
    }

    public List<Predmet> getPrenetiPredmeti() {
        return prenetiPredmeti;
    }

    public void setPrenetiPredmeti(List<Predmet> prenetiPredmeti) {
        this.prenetiPredmeti = prenetiPredmeti;
    }

    @Override
    public int getGodinaStudija() {
        return super.getGodina();
    }

    @Override
    public boolean proveriUslov(Student student) {

        int ukupanEspb = 0;

        for(Predmet p:student.getPolozeniPredmeti()) {
            ukupanEspb += p.getEspb();
        }

        switch (this.godinaKojuUpisuje) {

            case 1:
                return true;
            case 2:
                if(ukupanEspb<30) {
                    return false;
                }
            case 3:
                if(ukupanEspb<90) {
                    return false;
                }
            case 4:
                if(ukupanEspb<150) {
                    return false;
                }
            default:
                return true;

        }


    }
}
