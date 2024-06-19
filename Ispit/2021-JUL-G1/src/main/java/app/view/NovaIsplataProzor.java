package app.view;

import app.controller.NovaIsplataController;
import app.model.Baza;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NovaIsplataProzor extends GridPane {
    private Label lblIznos;
    private Label lblPrimalac;
    private Label lblKategorija;
    private TextField tfIznos;
    private TextField tfPrimalac;
    private ComboBox<String> comboBoxKategorija;
    private Button btnPlati;
    private PrviProzor prviProzor;
    private Stage stage;
    private Label lblPoruka;

    public NovaIsplataProzor(PrviProzor prviProzor, Stage stage) {
        this.prviProzor = prviProzor;
        this.stage = stage;
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnPlati.setOnAction(new NovaIsplataController(this));
    }

    private void addElements() {
        this.setAlignment(Pos.CENTER);
        this.setHgap(15);
        this.setVgap(15);
        this.setPadding(new Insets(15));
        this.addColumn(0, lblIznos, lblPrimalac, lblKategorija, btnPlati);
        this.addColumn(1, tfIznos, tfPrimalac, comboBoxKategorija);
        this.add(lblPoruka, 0, 4, 2, 1);
    }

    private void initElements() {
        lblIznos = new Label("Iznos");
        lblPrimalac = new Label("Primalac");
        lblKategorija = new Label("Kategorija");
        tfIznos = new TextField();
        tfPrimalac = new TextField();
        comboBoxKategorija = new ComboBox<>();
        comboBoxKategorija.getItems().addAll(Baza.getInstance().getKategorije());
        btnPlati = new Button("Plati");
        lblPoruka = new Label("");
    }

    public Label getLblIznos() {
        return lblIznos;
    }

    public Label getLblPrimalac() {
        return lblPrimalac;
    }

    public Label getLblKategorija() {
        return lblKategorija;
    }

    public TextField getTfIznos() {
        return tfIznos;
    }

    public TextField getTfPrimalac() {
        return tfPrimalac;
    }

    public ComboBox<String> getComboBoxKategorija() {
        return comboBoxKategorija;
    }

    public Button getBtnPlati() {
        return btnPlati;
    }

    public PrviProzor getPrviProzor() {
        return prviProzor;
    }

    public Stage getStage() {
        return stage;
    }

    public Label getLblPoruka() {
        return lblPoruka;
    }
}
