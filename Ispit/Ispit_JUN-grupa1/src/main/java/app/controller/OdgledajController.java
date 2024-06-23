package app.controller;

import app.model.Kurs;
import app.model.KursTabela;
import app.view.MainWindow;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class OdgledajController implements EventHandler<ActionEvent> {
    private ComboBox<Integer> cbSati;
    private ComboBox<Integer> cbMinuti;
    private TextField trajanjeAktivnosti;
    private ListView<Kurs> kursListView;
    private MainWindow mainWindow;

    public OdgledajController(ComboBox<Integer> cbSati, ComboBox<Integer> cbMinuti, TextField trajanjeAktivnosti, ListView<Kurs> kursListView, MainWindow mainWindow) {
        this.cbSati = cbSati;
        this.cbMinuti = cbMinuti;
        this.trajanjeAktivnosti = trajanjeAktivnosti;
        this.kursListView = kursListView;
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        int sati = cbSati.getSelectionModel().getSelectedItem();
        int minuti = cbMinuti.getSelectionModel().getSelectedItem();
        int trajanja = Integer.parseInt(trajanjeAktivnosti.getText());
        if(trajanja > 120 || trajanja < 1) {
            this.mainWindow.getLblGledanjeIndikator().setText("Ne moze bajo");
            return;
        }
        Kurs k = kursListView.getSelectionModel().getSelectedItem();

        int temp = (minuti+trajanja)/60;
        int tempMin = (minuti+trajanja)%60;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(""+sati).append(":"+minuti);

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(""+sati+temp).append(":"+minuti+tempMin);

        KursTabela kt = new KursTabela(k.getNaziv(), k.getKategorija(), LocalDate.now(), stringBuilder.toString(), LocalDate.now(), stringBuilder1.toString(), (trajanja/minuti)*10);

        this.mainWindow.getTv().getItems().add(kt);

    }
}
