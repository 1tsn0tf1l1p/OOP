package app.controller;

import app.model.Auto;
import app.model.Baza;
import app.model.Rezervisan;
import app.view.Prozor1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import java.time.LocalDate;
import java.time.Period;

public class RezervisiController implements EventHandler<ActionEvent> {
    private Prozor1 prozor1;

    public RezervisiController(Prozor1 prozor1) {
        this.prozor1 = prozor1;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String[] splitovanPocetak = this.prozor1.getTfPocetak().getText().split("-");
        String[] splitovanKraj = this.prozor1.getTfKraj().getText().split("-");
        LocalDate ldPocetak = LocalDate.of(Integer.parseInt(splitovanPocetak[0]), Integer.parseInt(splitovanPocetak[1]),
                Integer.parseInt(splitovanPocetak[2]));
        LocalDate ldKraj = LocalDate.of(Integer.parseInt(splitovanKraj[0]), Integer.parseInt(splitovanKraj[1]),
                Integer.parseInt(splitovanKraj[2]));
        Auto a = (Auto) this.prozor1.getTv().getSelectionModel().getSelectedItem();
        String marka = a.getName();
        String model = a.getModel();
        String tipStringovno = a.getTip();
        Double cenaDan = a.getCenaDan();
        Double cenaUkupno = Period.between(ldPocetak, ldKraj).getDays()*a.getCenaDan();

        boolean flag = false;

        for (Rezervisan rezervisan : Baza.getInstance().getRezervisani()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Nije ispravan datum!");
            if(rezervisan.getTip().equals(tipStringovno)) {
                return;
            }
            if(!rezervisan.getMarka().equals(marka)) {
                continue;
            }
            if(!rezervisan.getModel().equals(model)) {
                continue;
            }
            if((rezervisan.getOdDatum().isAfter(ldPocetak) && rezervisan.getDoDatum().isBefore(ldKraj)) ||
                    (rezervisan.getOdDatum().isAfter(ldPocetak) && rezervisan.getDoDatum().isAfter(ldKraj)) ||
                    (rezervisan.getOdDatum().isBefore(ldPocetak) && rezervisan.getDoDatum().isBefore(ldKraj)) ||
                    (rezervisan.getOdDatum().isEqual(ldKraj) && rezervisan.getDoDatum().isEqual(ldKraj))) {
                return;
            }
        }
        Rezervisan r = new Rezervisan(tipStringovno, marka, model, cenaDan, ldPocetak, ldKraj, cenaUkupno);
        Baza.getInstance().getRezervisani().add(r);
        System.out.println(Baza.getInstance().getRezervisani());
    }
}
