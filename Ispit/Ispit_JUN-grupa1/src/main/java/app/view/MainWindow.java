package app.view;

import app.controller.DodajKursController;
import app.controller.OdgledajController;
import app.model.Baza;
import app.model.Kurs;
import app.model.KursTabela;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainWindow extends VBox {
    private Label lblRafCoursera;
    private Label lblRaspolozivo;
    private Label lblDostupniKursevi;
    private Label lblMojiKursevi;
    private ListView<Kurs> lvDostupniKursevi;
    private ObservableList<Kurs> olDostupniKursevi;
    private ListView lvMojiKursevi;
    private Button btnDodajKurs;
    private Label lblPocetakAktivnosti;
    private Label lblSati;
    private Label lblMinuti;
    private ComboBox<Integer> cbSati;
    private ComboBox<Integer> cbMinuti;
    private Label lblTrajanjeAktivnosti;
    private TextField tfTrajanjeAktivnosti;
    private Button btnOdgledaj;
    private Label lblGledanjeIndikator;

    // --------------------------------------

    private TableView<KursTabela> tv;
    TableColumn<KursTabela, String> tcKurs = new TableColumn<>("Kurs");
    TableColumn<KursTabela, String> tcKategorija = new TableColumn<>("Kategorija");
    TableColumn<KursTabela, LocalDate> tcDatumPocetak = new TableColumn<>("Pocetak (Datum)");
    TableColumn<KursTabela, String> tcVremePocetak = new TableColumn<>("Pocetak (Vreme)");
    TableColumn<KursTabela, LocalDate> tcDatumKraj = new TableColumn<>("Kraj (Datum)");
    TableColumn<KursTabela, String> tcVremeKraj = new TableColumn<>("Kraj (Vreme)");
    TableColumn<KursTabela, String> tcKompletiranost = new TableColumn<>("Kompletiranost");


    // --------------------------------------

    private Button btnSnimiAktivnosti;
    private HBox hBox;
    private VBox vBox1;
    private VBox vBox2;
    private VBox vBoxPocetakAktivnosti;
    private HBox hBoxMini1;
    private HBox hBoxMini2;
    private Label lblMaksimumMinuta;

    public MainWindow() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnDodajKurs.setOnAction(new DodajKursController(lvDostupniKursevi, lvMojiKursevi, lblRaspolozivo));
        btnOdgledaj.setOnAction(new OdgledajController(cbSati, cbMinuti, tfTrajanjeAktivnosti, lvMojiKursevi, this));
    }

    private void addElements() {
        this.setSpacing(10);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(10));
        this.getChildren().addAll(lblRafCoursera, lblRaspolozivo);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(10));
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.setPadding(new Insets(10));
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setPadding(new Insets(10));
        vBoxPocetakAktivnosti.setSpacing(10);
        vBoxPocetakAktivnosti.setAlignment(Pos.CENTER);
        vBoxPocetakAktivnosti.setPadding(new Insets(10));
        hBoxMini1.setSpacing(10);
        hBoxMini1.setAlignment(Pos.CENTER);
        hBoxMini1.setPadding(new Insets(10));
        hBoxMini2.setSpacing(10);
        hBoxMini2.setAlignment(Pos.CENTER);
        hBoxMini2.setPadding(new Insets(10));

        vBox1.getChildren().addAll(lblDostupniKursevi, lvDostupniKursevi);
        vBox2.getChildren().addAll(lblMojiKursevi, lvMojiKursevi);

        hBoxMini1.getChildren().addAll(lblSati, cbSati, lblMinuti, cbMinuti);
        hBoxMini2.getChildren().addAll(tfTrajanjeAktivnosti, lblMaksimumMinuta);

        vBoxPocetakAktivnosti.getChildren().addAll(lblPocetakAktivnosti, hBoxMini1, lblTrajanjeAktivnosti,
                hBoxMini2, btnOdgledaj, lblGledanjeIndikator);

        hBox.getChildren().addAll(vBox1, btnDodajKurs, vBox2, vBoxPocetakAktivnosti);
        this.getChildren().addAll(hBox, tv, btnSnimiAktivnosti);
    }

    private void initElements() {
        lblRafCoursera = new Label("RAF Coursera");
        lblRaspolozivo = new Label("Raspolozivo: $" + Baza.getRaspolozivo());
        lblDostupniKursevi = new Label("Dostupni kursevi: ");
        lblMojiKursevi = new Label("Moji kursevi: ");
        olDostupniKursevi = FXCollections.observableArrayList(Baza.getInstance().getKursevi());
        lvDostupniKursevi = new ListView<>(olDostupniKursevi);
        lvDostupniKursevi.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        lvMojiKursevi = new ListView<>();
        btnDodajKurs = new Button("Dodaj kurs");
        lblPocetakAktivnosti = new Label("Pocetak aktivnosti");
        lblSati = new Label("Sati: ");
        lblMinuti = new Label("Minuti:");

        // ------------------------------------

        cbSati = new ComboBox<>();
        List<Integer> lSati = new ArrayList<>();
        for(int i = 1; i <= 24; i++) {
            lSati.add(i);
        }
        System.out.println(lSati);
        cbSati.getItems().addAll(lSati);
        cbMinuti = new ComboBox<>();
        List<Integer> lMinuti = new ArrayList<>();
        for(int i = 0; i<=60; i+=5) {
            lMinuti.add(i);
        }
        System.out.println(lMinuti);
        cbMinuti.getItems().addAll(lMinuti);

        // ------------------------------------

        lblTrajanjeAktivnosti = new Label("Trajanje aktivnosti");
        tfTrajanjeAktivnosti = new TextField();
        tfTrajanjeAktivnosti.setPrefWidth(50);
        btnOdgledaj = new Button("Odgledaj");
        lblGledanjeIndikator = new Label("");

        // -----------------------------------

        tv = new TableView<>();
        tv.getColumns().addAll(tcKurs, tcKategorija, tcDatumPocetak, tcVremePocetak, tcDatumKraj,
                tcVremeKraj, tcKompletiranost);
        tcKurs.setCellValueFactory(new PropertyValueFactory<>("naziv"));
        tcKategorija.setCellValueFactory(new PropertyValueFactory<>("kategorija"));
        tcDatumPocetak.setCellValueFactory(new PropertyValueFactory<>("pocetakDatum"));
        tcVremePocetak.setCellValueFactory(new PropertyValueFactory<>("pocetakVreme"));
        tcDatumKraj.setCellValueFactory(new PropertyValueFactory<>("kraj"));
        tcVremeKraj.setCellValueFactory(new PropertyValueFactory<>("krajVreme"));
        tcKompletiranost.setCellValueFactory(new PropertyValueFactory<>("kompletiranost"));


        // -----------------------------------

        btnSnimiAktivnosti = new Button("Snimi Aktivnosti");
        hBox = new HBox();
        vBox1 = new VBox();
        vBox2 = new VBox();
        vBoxPocetakAktivnosti = new VBox();
        hBoxMini1 = new HBox();
        hBoxMini2 = new HBox();
        lblMaksimumMinuta = new Label("(max 120 min)");
    }

    public Label getLblRafCoursera() {
        return lblRafCoursera;
    }

    public Label getLblRaspolozivo() {
        return lblRaspolozivo;
    }

    public Label getLblDostupniKursevi() {
        return lblDostupniKursevi;
    }

    public Label getLblMojiKursevi() {
        return lblMojiKursevi;
    }

    public ListView<Kurs> getLvDostupniKursevi() {
        return lvDostupniKursevi;
    }

    public ObservableList<Kurs> getOlDostupniKursevi() {
        return olDostupniKursevi;
    }

    public ListView getLvMojiKursevi() {
        return lvMojiKursevi;
    }

    public Button getBtnDodajKurs() {
        return btnDodajKurs;
    }

    public Label getLblPocetakAktivnosti() {
        return lblPocetakAktivnosti;
    }

    public Label getLblSati() {
        return lblSati;
    }

    public Label getLblMinuti() {
        return lblMinuti;
    }

    public ComboBox<Integer> getCbSati() {
        return cbSati;
    }

    public ComboBox<Integer> getCbMinuti() {
        return cbMinuti;
    }

    public Label getLblTrajanjeAktivnosti() {
        return lblTrajanjeAktivnosti;
    }

    public TextField getTfTrajanjeAktivnosti() {
        return tfTrajanjeAktivnosti;
    }

    public Button getBtnOdgledaj() {
        return btnOdgledaj;
    }

    public Label getLblGledanjeIndikator() {
        return lblGledanjeIndikator;
    }

    public TableView<KursTabela> getTv() {
        return tv;
    }

    public TableColumn<KursTabela, String> getTcKurs() {
        return tcKurs;
    }

    public TableColumn<KursTabela, String> getTcKategorija() {
        return tcKategorija;
    }

    public TableColumn<KursTabela, LocalDate> getTcDatumPocetak() {
        return tcDatumPocetak;
    }

    public TableColumn<KursTabela, String> getTcVremePocetak() {
        return tcVremePocetak;
    }

    public TableColumn<KursTabela, LocalDate> getTcDatumKraj() {
        return tcDatumKraj;
    }

    public TableColumn<KursTabela, String> getTcVremeKraj() {
        return tcVremeKraj;
    }

    public TableColumn<KursTabela, String> getTcKompletiranost() {
        return tcKompletiranost;
    }

    public Button getBtnSnimiAktivnosti() {
        return btnSnimiAktivnosti;
    }

    public HBox gethBox() {
        return hBox;
    }

    public VBox getvBox1() {
        return vBox1;
    }

    public VBox getvBox2() {
        return vBox2;
    }

    public VBox getvBoxPocetakAktivnosti() {
        return vBoxPocetakAktivnosti;
    }

    public HBox gethBoxMini1() {
        return hBoxMini1;
    }

    public HBox gethBoxMini2() {
        return hBoxMini2;
    }

    public Label getLblMaksimumMinuta() {
        return lblMaksimumMinuta;
    }
}
