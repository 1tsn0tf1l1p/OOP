package app.view;

import app.model.Baza;
import app.model.Kurs;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
    private ComboBox cbSati;
    private ComboBox cbMinuti;
    private Label lblTrajanjeAktivnosti;
    private TextField tfTrajanjeAktivnosti;
    private Button btnOdgledaj;
    private Label lblGledanjeIndikator;
    private TableView tv;
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
        lvMojiKursevi = new ListView<>();
        btnDodajKurs = new Button("Dodaj kurs");
        lblPocetakAktivnosti = new Label("Pocetak aktivnosti");
        lblSati = new Label("Sati: ");
        lblMinuti = new Label("Minuti:");
        cbSati = new ComboBox<>();
        cbMinuti = new ComboBox<>();
        lblTrajanjeAktivnosti = new Label("Trajanje aktivnosti");
        tfTrajanjeAktivnosti = new TextField();
        tfTrajanjeAktivnosti.setPrefWidth(50);
        btnOdgledaj = new Button("Odgledaj");
        lblGledanjeIndikator = new Label("");
        tv = new TableView<>();
        btnSnimiAktivnosti = new Button("Snimi Aktivnosti");
        hBox = new HBox();
        vBox1 = new VBox();
        vBox2 = new VBox();
        vBoxPocetakAktivnosti = new VBox();
        hBoxMini1 = new HBox();
        hBoxMini2 = new HBox();
        lblMaksimumMinuta = new Label("(max 120 min)");
    }
}
