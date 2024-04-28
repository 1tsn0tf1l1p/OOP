import java.util.List;

public class Tim implements Registracija{

    private List<Polaznik> polaznici;
    private Polaznik vodjaTima;

    @Override
    public boolean registruj(Obuka obuka) {

        if(polaznici == null) {
            return false;
        }

        for(Polaznik p:polaznici) {
            ObukaPolaznika obukaPolaznika = new ObukaPolaznika(p);
            p.getObuke().add(obuka);
        }

        ObukaPolaznika obukaPolaznikaVodja = new ObukaPolaznika(vodjaTima);
        vodjaTima.getObuke().add(obuka);

        return true;
    }

    @Override
    public boolean registrovan(Obuka obuka) {
        return false;
    }
}
