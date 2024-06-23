package app.controller;

import app.model.Baza;
import app.model.Vanzemaljac;
import app.view.MainProzor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FiltrirajController implements EventHandler<ActionEvent> {
    private MainProzor mainProzor;

    public FiltrirajController(MainProzor mainProzor) {
        this.mainProzor = mainProzor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String kontinent = (String) this.mainProzor.getCbKontinent().getSelectionModel().getSelectedItem();
        Boolean pronadjen = this.mainProzor.getCheckBoxPronadjen().isSelected();
        Boolean izgubljen = this.mainProzor.getCheckBoxIzgubljen().isSelected();

        ObservableList<Vanzemaljac> vanzemaljacObservableList = FXCollections.observableArrayList();

        if(kontinent.equals("Svi kontinenti")) {
            // za sve
            if(pronadjen && !izgubljen) {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(vanzemaljac.isPronadjen()) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
            else if(!pronadjen && izgubljen) {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(!vanzemaljac.isPronadjen()) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
            else if(!pronadjen && !izgubljen) {
                vanzemaljacObservableList.addAll(Baza.getInstance().getVanzemaljci());
            }
            else {
                vanzemaljacObservableList.addAll(Baza.getInstance().getVanzemaljci());
            }
        }
        else {
            // za selektovan
            if(pronadjen && !izgubljen) {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(vanzemaljac.isPronadjen() && vanzemaljac.getKontinent().equals(kontinent)) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
            else if(!pronadjen && izgubljen) {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(!vanzemaljac.isPronadjen() && vanzemaljac.getKontinent().equals(kontinent)) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
            else if(!pronadjen && !izgubljen) {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(vanzemaljac.getKontinent().equals(kontinent)) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
            else {
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(vanzemaljac.getKontinent().equals(kontinent)) {
                        vanzemaljacObservableList.add(vanzemaljac);
                    }
                }
            }
        }

        this.mainProzor.getTv().setItems(vanzemaljacObservableList);
        this.mainProzor.getTv().refresh();

    }
}
