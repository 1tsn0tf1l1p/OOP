package app.controller;

import app.model.Baza;
import app.model.Kurs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.List;

public class DodajKursController implements EventHandler<ActionEvent> {
    private ListView<Kurs> kursevi;
    private ListView<Kurs> mojiKursevi;
    private Label raspolozivo;

    public DodajKursController(ListView<Kurs> kursevi, ListView<Kurs> mojiKursevi, Label raspolozivo) {
        this.kursevi = kursevi;
        this.mojiKursevi = mojiKursevi;
        this.raspolozivo = raspolozivo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Usao na pocetak");
        ObservableList<Kurs> olKursevi = FXCollections.observableArrayList(kursevi.getSelectionModel().getSelectedItems());
        ObservableList<Kurs> olMojiKursevi = FXCollections.observableArrayList(mojiKursevi.getItems());

        System.out.println(olMojiKursevi.size());

        int staraCena = Integer.parseInt(raspolozivo.getText().replace("Raspolozivo: $", ""));

        for (Kurs kurs : olKursevi) {
            if(olMojiKursevi.contains(kurs)) {
                System.out.println("greska1");
                Alert al = new Alert(Alert.AlertType.ERROR);
                al.setContentText("Pokusali ste da dodate isti kurs dva puta!");
                al.show();
                return;
            }
            if(Baza.getInstance().getRaspolozivo() - Integer.parseInt(kurs.getCena().replace("$", "")) < 0) {
                System.out.println("greska2");
                Alert al1 = new Alert(Alert.AlertType.ERROR);
                al1.setContentText("Nemate dovoljno sredstava!");
                al1.show();
                raspolozivo.setText("Raspolozivo: $" + staraCena);
                return;
            }
            olMojiKursevi.add(kurs);
            int novaCena;
            novaCena = Baza.getRaspolozivo() - Integer.parseInt(kurs.getCena().replace("$", ""));
            Baza.setRaspolozivo(novaCena);
            raspolozivo.setText("Raspolozivo: $" + Baza.getInstance().getRaspolozivo());
        }
        mojiKursevi.getItems().addAll(olMojiKursevi);

    }
}
