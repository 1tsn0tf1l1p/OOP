import java.util.List;

public class UpisGodine extends AktivnostStudenta{

    private int godinaKojuUpisuje;
    private List<Predmet> prenetiPredmeti;

    public UpisGodine(int godina, int mesec, int dan, List<Predmet> prenetiPredmeti) {
        super(godina, mesec, dan);
        this.prenetiPredmeti = prenetiPredmeti;
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
        return godinaKojuUpisuje;
    }

    @Override
    public boolean proveriUslov(Student student) {
        // TODO

        switch (godinaKojuUpisuje) {

            int ukupanBrojEspb = 0;

            case 1:

                return true;

            case 2:

                for(Predmet predmet:student.getPolozeniPredmeti()) {
                    ukupanBrojEspb += predmet.getEspb();
                }
                if(ukupanBrojEspb<30) {
                    return false;
                }else{
                    return true;
                }

                ukupanBrojEspb = 0;

            case 3:

                for(Predmet predmet:student.getPolozeniPredmeti()) {
                    ukupanBrojEspb += predmet.getEspb();
                }
                if(ukupanBrojEspb<90) {
                    return false;
                }else{
                    return true;
                }

                ukupanBrojEspb = 0;

            case 4:

                for(Predmet predmet:student.getPolozeniPredmeti()) {
                    ukupanBrojEspb += predmet.getEspb();
                }
                if(ukupanBrojEspb<150) {
                    return false;
                }else{
                    return true;
                }

                ukupanBrojEspb = 0;



            default:
                System.out.println("Unesli ste pogresnu godinu!");
                return false;



        }



    }

    @Override
    public int compareTo(AktivnostStudenta o) {
        // TODO
    }
}
