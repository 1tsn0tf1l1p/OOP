import java.util.ArrayList;
import java.util.List;

public class Profesor implements Registracija{

    private String ime;
    private String prezime;
    private String id;
    private Oblast oblast;
    private List<Obuka> obuke;

    public Profesor(String ime, String prezime, String id, Oblast oblast) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.oblast = oblast;
        this.obuke = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Oblast getOblast() {
        return oblast;
    }

    public void setOblast(Oblast oblast) {
        this.oblast = oblast;
    }

    public List<Obuka> getObuke() {
        return obuke;
    }

    public void setObuke(List<Obuka> obuke) {
        this.obuke = obuke;
    }

    @Override
    public boolean registruj(Obuka obuka) {
        if(!(this.oblast == obuka.getOblast())){
            return false;
        }
        if(!this.obuke.contains(obuka)) {
            return false;
        }
        if(this.obuke.size()>3) {
            return false;
        }
        /*
        if(obuka instanceof Projekat) {
            if(obuka.getPredavaci().size()<((Projekat) obuka).getMaksimalanBrojPolaznika()) {
                obuke.add(obuka);
                obuka.getPredavaci().add(this);
                return true;
            }else{
                return false;
            }
        }

         */

        if(obuka instanceof Projekat) {
            if(obuka.getPredavaci().size() < ((Projekat) obuka).getMaksimalanBrojPolaznika())
        }

        obuke.add(obuka);
        obuka.getPredavaci().add(this);
        return true;

    }

    @Override
    public boolean registrovan(Obuka obuka) {
            if(this.obuke.contains(obuka)) {
                return true;
            }else{
                return false;
            }

    }
}
