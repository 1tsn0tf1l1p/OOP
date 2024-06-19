package app.controller;

import app.model.Baza;
import app.model.TipTransakcije;
import app.model.Transakcija;
import app.view.NovaIsplataProzor;
import app.view.PrviProzor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;

import java.time.LocalDate;

public class NovaIsplataController implements EventHandler<ActionEvent> {
    private NovaIsplataProzor novaIsplataProzor;

    public NovaIsplataController(NovaIsplataProzor novaIsplataProzor) {
        this.novaIsplataProzor = novaIsplataProzor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        int iznos = 0;
        try{
            iznos = Integer.parseInt(this.novaIsplataProzor.getTfIznos().getText());
        }catch (Exception e) {
            this.novaIsplataProzor.getLblPoruka().setText("Pogresan format broja!");
            this.novaIsplataProzor.getLblPoruka().setTextFill(Color.RED);
            return;
        }

        if(Baza.getInstance().getTrenutnoStanje() - iznos < 0) {
            this.novaIsplataProzor.getLblPoruka().setText("Nemate dovoljno novca!");
            this.novaIsplataProzor.getLblPoruka().setTextFill(Color.RED);
        }
        else {
            String primalac = this.novaIsplataProzor.getTfPrimalac().getText();
            String kategorija = this.novaIsplataProzor.getComboBoxKategorija().getSelectionModel().getSelectedItem();

            Transakcija transakcija = new Transakcija(TipTransakcije.ISPLATA, iznos, primalac, LocalDate.now(), kategorija);
            //Baza.getInstance().getTransakcije().add(transakcija);
            this.novaIsplataProzor.getPrviProzor().getOlTransakcije().add(transakcija);
            Baza.getInstance().setTrenutnoStanje(Baza.getInstance().getTrenutnoStanje() - iznos);
            this.novaIsplataProzor.getPrviProzor().getLblTrenutnoStanje().setText("Trenutno stanje: " + Baza.getInstance().getTrenutnoStanje());
            this.novaIsplataProzor.getStage().close();
        }
    }
}
