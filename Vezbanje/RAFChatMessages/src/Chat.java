import java.util.ArrayList;
import java.util.List;

public class Chat {

    private List<Poruka> svePoruke;
    private List<String> sviPosiljaoci;

    public Chat() {
        this.svePoruke = new ArrayList<>();
        this.sviPosiljaoci = new ArrayList<>();
    }

    public List<Poruka> getSvePoruke() {
        return svePoruke;
    }

    public void setSvePoruke(List<Poruka> svePoruke) {
        this.svePoruke = svePoruke;
    }

    public List<String> getSviPosiljaoci() {
        return sviPosiljaoci;
    }

    public void setSviPosiljaoci(List<String> sviPosiljaoci) {
        this.sviPosiljaoci = sviPosiljaoci;
    }

    public void dodajPorukuUChat(Poruka poruka) {

        this.svePoruke.add(poruka);

        if(!this.sviPosiljaoci.contains(poruka.getPosiljalac())) {
            this.sviPosiljaoci.add(poruka.getPosiljalac());
        }


    }

}
