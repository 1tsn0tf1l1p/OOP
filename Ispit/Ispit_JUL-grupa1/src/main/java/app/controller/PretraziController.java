package app.controller;

import app.model.Auto;
import app.model.Baza;
import app.model.Tip;
import app.view.Prozor1;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.List;
import java.util.Map;

public class PretraziController implements EventHandler<ActionEvent> {
    private Prozor1 prozor1;
    public PretraziController(Prozor1 prozor1) {
        this.prozor1 = prozor1;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Tip t = prozor1.getLv().getSelectionModel().getSelectedItem();
        ObservableList<Auto> autiZaTip = FXCollections.observableArrayList();
        for (Map.Entry<Tip, List<Auto>> tipListEntry : Baza.getInstance().getTipoviAuti().entrySet()) {
            if(t.getIme().equals(tipListEntry.getKey().getIme())) {
                System.out.println("usao");
                autiZaTip.addAll(tipListEntry.getValue());
            }
        }
        prozor1.getTv().setItems(autiZaTip);
    }
}
