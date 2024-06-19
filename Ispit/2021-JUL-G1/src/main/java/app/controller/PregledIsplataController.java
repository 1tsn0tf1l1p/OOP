package app.controller;

import app.model.Baza;
import app.model.TipTransakcije;
import app.model.Transakcija;
import app.view.PregledIsplataProzor;
import app.view.PrviProzor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PregledIsplataController implements EventHandler<ActionEvent> {

    private PrviProzor prviProzor;

    public PregledIsplataController(PrviProzor prviProzor) {
        this.prviProzor = prviProzor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Map<String, Integer> mapa = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = 0;

        List<Transakcija> selektovaneTransakcije = this.prviProzor.getTableView().getSelectionModel().getSelectedItems();

        for (Transakcija transakcija : selektovaneTransakcije) {
                if(transakcija.getIznos() > max) {
                    max = transakcija.getIznos();
                }
                if(transakcija.getIznos() < min) {
                    min = transakcija.getIznos();
                }
        }

        for (Transakcija transakcija : selektovaneTransakcije) {
            if(!transakcija.getTipTransakcije().equals(TipTransakcije.ISPLATA)) {
                continue;
            } else {
                if(mapa.containsKey(transakcija.getKategorija())) {
                    mapa.put(transakcija.getKategorija(), mapa.get(transakcija.getKategorija()) + transakcija.getIznos());
                } else {
                    mapa.put(transakcija.getKategorija(), transakcija.getIznos());
                }
            }
        }

        Stage stagePregledIsplata = new Stage();
        Scene scenePregledIsplata = new Scene(new PregledIsplataProzor(mapa, min, max, stagePregledIsplata));
        stagePregledIsplata.setTitle("OOP - Ispit jul");
        stagePregledIsplata.setScene(scenePregledIsplata);
        stagePregledIsplata.show();
    }
}
