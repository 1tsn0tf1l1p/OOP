public class PromenaStudijskogPrograma extends AktivnostStudenta{

    private String nazivNovogPrograma;
    private int godinaUpisa;
    private int broj;

    public PromenaStudijskogPrograma(int godina, int mesec, int dan, String nazivNovogPrograma, int godinaUpisa, int broj) {
        super(godina, mesec, dan);
        this.nazivNovogPrograma = nazivNovogPrograma;
        this.godinaUpisa = godinaUpisa;
        this.broj = broj;
    }

    public boolean daLiMozePromenitiSmer(Student student) {

        int ukupanEspb = 0;

        for(Predmet p:student.getPolozeniPredmeti()) {
            ukupanEspb += p.getEspb();
        }

        if(ukupanEspb < 48) {
            return false;
        }else {
            UpisGodine ug = (UpisGodine) student.getAktivnosti().getLast();
            student.getAktivnosti().add(ug);
        }


    }

    public String getNazivNovogPrograma() {
        return nazivNovogPrograma;
    }

    public void setNazivNovogPrograma(String nazivNovogPrograma) {
        this.nazivNovogPrograma = nazivNovogPrograma;
    }

    public int getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(int godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public int getGodinaStudija() {
        return 0;
    }

    @Override
    public boolean proveriUslov(Student student) {
        return false;
    }
}
