package app.view;

import app.controller.PretraziController;
import app.controller.RecenzijeController;
import app.controller.RezervisiController;
import app.model.Auto;
import app.model.Baza;
import app.model.Tip;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;
import java.time.Period;

public class Prozor1 extends VBox {
    private Label lblRentACar;
    private Label lblTipovi;
    private ListView<Tip> lv;
    private Label lblPeriodRentiranja;
    private TextField tfPocetak;
    private TextField tfKraj;
    private Button btnPretrazi;
    private Label lblDostupnostZaPeriod;
    private TableView<Auto> tv;
    private Label lblCenaOdabraniPeriod;
    private Button btnRezervisi;
    private Button btnSveRezervacije;
    private Label crtica;
    private VBox vbox1;
    private VBox vbox2;
    private HBox hboxBig;
    private HBox hboxMini;
    private HBox hboxMini2;
    private TableColumn<Auto, String> colMarka;
    private TableColumn<Auto, String> colModel;
    private TableColumn<Auto, Double> colCena;

    public Prozor1() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnPretrazi.setOnAction(new PretraziController(this));

        tv.setOnMouseClicked(e -> {
            if(tv.getSelectionModel().getSelectedItem() == null) {
                return;
            }
            Auto a = tv.getSelectionModel().getSelectedItem();
            String[] splitovanPocetak = tfPocetak.getText().split("-");
            String[] splitovanKraj = tfKraj.getText().split("-");
            LocalDate ldPocetak = LocalDate.of(Integer.parseInt(splitovanPocetak[0]), Integer.parseInt(splitovanPocetak[1]),
                    Integer.parseInt(splitovanPocetak[2]));
            LocalDate ldKraj = LocalDate.of(Integer.parseInt(splitovanKraj[0]), Integer.parseInt(splitovanKraj[1]),
                    Integer.parseInt(splitovanKraj[2]));
            int vremenskiPeriod = Period.between(ldPocetak, ldKraj).getDays();
            lblCenaOdabraniPeriod.setText("Cena za odabrani period: $" + vremenskiPeriod*a.getCenaDan());
        });

        btnRezervisi.setOnAction(new RezervisiController(this));
        btnSveRezervacije.setOnAction(new RecenzijeController(this));
    }

    private void addElements() {
        this.setPadding(new Insets(15, 5, 15, 5));
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        vbox1.setAlignment(Pos.CENTER_LEFT);
        vbox1.setPadding(new Insets(15, 5, 15, 5));
        vbox1.setSpacing(15);
        vbox1.getChildren().addAll(lblTipovi, lv);
        hboxBig.setPadding(new Insets(15, 5, 15, 5));
        hboxBig.setSpacing(15);
        hboxBig.setAlignment(Pos.CENTER);
        vbox2.setPadding(new Insets(15, 5, 15, 5));
        vbox2.setSpacing(15);
        vbox2.setAlignment(Pos.CENTER_LEFT);
        hboxMini.setPadding(new Insets(15, 5, 15, 5));
        hboxMini.setSpacing(15);
        hboxMini.setAlignment(Pos.CENTER);
        hboxMini2.setPadding(new Insets(15, 5, 15, 5));
        hboxMini2.setSpacing(15);
        hboxMini2.setAlignment(Pos.CENTER_RIGHT);
        hboxMini.getChildren().addAll(tfPocetak, crtica, tfKraj, btnPretrazi);
        vbox2.getChildren().addAll(lblPeriodRentiranja, hboxMini);
        hboxBig.getChildren().addAll(vbox1, vbox2);
        hboxMini2.getChildren().add(btnSveRezervacije);
        this.getChildren().addAll(lblRentACar, hboxBig, lblDostupnostZaPeriod, tv, lblCenaOdabraniPeriod, btnRezervisi, hboxMini2);
    }

    private void initElements() {
        lblRentACar = new Label("RENT-A-CAR");
        lblTipovi = new Label("Tipovi:");
        ObservableList<Tip> olTipovi = FXCollections.observableList(Baza.getInstance().getTipovi());
        lv = new ListView<>(olTipovi);
        lblPeriodRentiranja = new Label("Odaberite period rentiranja:");
        tfPocetak = new TextField();
        crtica = new Label("-");
        tfKraj = new TextField();
        btnPretrazi = new Button("Pretrazi");
        lblDostupnostZaPeriod = new Label("Dostupno za odabrani period:");
        tv = new TableView<>();
        colMarka = new TableColumn<>("Marka");
        colModel = new TableColumn<>("Model");
        colCena = new TableColumn<>("Cena po danu");
        colMarka.setCellValueFactory(new PropertyValueFactory<>("name"));
        colModel.setCellValueFactory(new PropertyValueFactory<>("model"));
        colCena.setCellValueFactory(new PropertyValueFactory<>("cenaDan"));
        tv.getColumns().addAll(colMarka, colModel, colCena);
        lblCenaOdabraniPeriod = new Label("Cena za odabrani period: ");
        btnRezervisi = new Button("Rezervisi");
        btnSveRezervacije = new Button("Sve Rezervacije");
        vbox1 = new VBox();
        vbox2 = new VBox();
        hboxBig = new HBox();
        hboxMini = new HBox();
        hboxMini2 = new HBox();


    }

    public Label getLblRentACar() {
        return lblRentACar;
    }

    public Label getLblTipovi() {
        return lblTipovi;
    }

    public ListView<Tip> getLv() {
        return lv;
    }

    public Label getLblPeriodRentiranja() {
        return lblPeriodRentiranja;
    }

    public TextField getTfPocetak() {
        return tfPocetak;
    }

    public TextField getTfKraj() {
        return tfKraj;
    }

    public Button getBtnPretrazi() {
        return btnPretrazi;
    }

    public Label getLblDostupnostZaPeriod() {
        return lblDostupnostZaPeriod;
    }

    public TableView getTv() {
        return tv;
    }

    public Label getLblCenaOdabraniPeriod() {
        return lblCenaOdabraniPeriod;
    }

    public Button getBtnRezervisi() {
        return btnRezervisi;
    }

    public Button getBtnSveRezervacije() {
        return btnSveRezervacije;
    }

    public Label getCrtica() {
        return crtica;
    }

    public VBox getVbox1() {
        return vbox1;
    }

    public VBox getVbox2() {
        return vbox2;
    }

    public HBox getHboxBig() {
        return hboxBig;
    }

    public HBox getHboxMini() {
        return hboxMini;
    }

    public HBox getHboxMini2() {
        return hboxMini2;
    }
}
