package app.controller;

import app.model.Baza;
import app.model.Drzava;
import app.model.Vanzemaljac;
import app.view.MainProzor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class UpisiController implements EventHandler<ActionEvent> {
    private MainProzor mainProzor;

    public UpisiController(MainProzor mainProzor) {
        this.mainProzor = mainProzor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Vanzemaljac v = this.mainProzor.getTv().getSelectionModel().getSelectedItem();
        String drzava = (String) this.mainProzor.getCbDrzave().getSelectionModel().getSelectedItem();
        String kontinent = v.getKontinent();
        String kontinentPravi = null;
        for (Drzava drzava1 : Baza.getInstance().getDrzave()) {
            if(drzava1.getDrzavaIme().equals(drzava)) {
                kontinentPravi = drzava1.getKontinentIme();
            }
        }
        for (Drzava drzava1 : Baza.getInstance().getDrzave()) {
            if(drzava1.getDrzavaIme().equals(drzava)) {
                if(drzava1.getKontinentIme().equals(kontinent) && !v.isPronadjen()) {
                    v.setDrzava(drzava);
                    for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                        if(v.equals(vanzemaljac)) {
                            vanzemaljac.setDrzava(drzava);
                        }

                    }
                    this.mainProzor.getLblPoruka().setText("");
                    this.mainProzor.getTv().refresh();
                    this.mainProzor.getLblPoruka().setText("Uspesno izvrsavanje.");
                    return;
                }
                else if(v.isPronadjen()){
                    this.mainProzor.getLblPoruka().setText("Vanzemaljac sa ID-jem " + v.getId() + " je vec pronadjen");
                    return;
                }
                else if(!drzava1.getKontinentIme().equals(kontinent)){

                    this.mainProzor.getLblPoruka().setText("Drzava " + drzava + " ne pripada kontinentu " + kontinent + " vec " +
                            "kontinentu " + kontinentPravi);
                    return;
                }
            }
        }
    }
}
