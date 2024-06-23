package app.view;

import app.model.PitanjeStatistika;
import com.sun.nio.sctp.AbstractNotificationHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class StatistikaWindow extends VBox {
    private TableView tv;
    private Button btnPovratak;
    private TableColumn<PitanjeStatistika, String> colOznakaPitanja;
    private TableColumn<PitanjeStatistika, Double> colMaxPoena;
    private TableColumn<PitanjeStatistika, Double> colProsek;
    private TableColumn<PitanjeStatistika, Double> colProcenatMax;


    public StatistikaWindow() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
    }

    private void addElements() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(15, 0, 15, 0));
        this.getChildren().addAll(tv, btnPovratak);
    }

    private void initElements() {
        tv = new TableView<>();
        btnPovratak = new Button("Povratak");
        colOznakaPitanja = new TableColumn<>("Oznaka pitanja");
        colMaxPoena = new TableColumn<>("Maks poena");
        colProsek = new TableColumn<>("Prosek");
        colProcenatMax = new TableColumn<>("Procenat maks");
        colOznakaPitanja.setCellValueFactory(new PropertyValueFactory<>("oznakaPitanja"));
        colMaxPoena.setCellValueFactory(new PropertyValueFactory<>("maxOcena"));
        colProsek.setCellValueFactory(new PropertyValueFactory<>("prosek"));
        colProcenatMax.setCellValueFactory(new PropertyValueFactory<>("procenatMax"));
        tv.getColumns().addAll(colOznakaPitanja, colMaxPoena, colProsek, colProcenatMax);
    }

    public TableView getTv() {
        return tv;
    }

    public void setTv(TableView tv) {
        this.tv = tv;
    }

    public Button getBtnPovratak() {
        return btnPovratak;
    }

    public void setBtnPovratak(Button btnPovratak) {
        this.btnPovratak = btnPovratak;
    }

    public TableColumn<PitanjeStatistika, String> getColOznakaPitanja() {
        return colOznakaPitanja;
    }

    public void setColOznakaPitanja(TableColumn<PitanjeStatistika, String> colOznakaPitanja) {
        this.colOznakaPitanja = colOznakaPitanja;
    }

    public TableColumn<PitanjeStatistika, Double> getColMaxPoena() {
        return colMaxPoena;
    }

    public void setColMaxPoena(TableColumn<PitanjeStatistika, Double> colMaxPoena) {
        this.colMaxPoena = colMaxPoena;
    }

    public TableColumn<PitanjeStatistika, Double> getColProsek() {
        return colProsek;
    }

    public void setColProsek(TableColumn<PitanjeStatistika, Double> colProsek) {
        this.colProsek = colProsek;
    }

    public TableColumn<PitanjeStatistika, Double> getColProcenatMax() {
        return colProcenatMax;
    }

    public void setColProcenatMax(TableColumn<PitanjeStatistika, Double> colProcenatMax) {
        this.colProcenatMax = colProcenatMax;
    }
}
