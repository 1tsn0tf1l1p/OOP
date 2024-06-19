package app.view;

import app.controller.NovaIsplataController;
import app.controller.PregledIsplataController;
import app.controller.SnimiController;
import app.model.Baza;
import app.model.TipTransakcije;
import app.model.Transakcija;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class PrviProzor extends VBox {

    private Label lblTrenutnoStanje;
    private TableView<Transakcija> tableView;
    private ObservableList<Transakcija> olTransakcije;
    private Button btnNovaIsplata;
    private Button btnPregledIsplata;
    private HBox hBoxDugmici;
    private Button snimi;

    public PrviProzor() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnNovaIsplata.setOnAction(e -> {
            Stage stageNovaIsplata = new Stage();
            Scene sceneNovaIsplata = new Scene(new NovaIsplataProzor(this, stageNovaIsplata));
            stageNovaIsplata.setTitle("OOP - ispit jul");
            stageNovaIsplata.setScene(sceneNovaIsplata);
            stageNovaIsplata.show();
        });
        btnPregledIsplata.setOnAction(new PregledIsplataController(this));
        snimi.setOnAction(new SnimiController());
    }

    private void addElements() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(15));
        this.setSpacing(15);
        hBoxDugmici.setAlignment(Pos.CENTER);
        hBoxDugmici.setSpacing(15);
        hBoxDugmici.setPadding(new Insets(15));
        hBoxDugmici.getChildren().addAll(btnNovaIsplata, btnPregledIsplata);
        this.getChildren().addAll(lblTrenutnoStanje, tableView, hBoxDugmici, snimi);
    }

    private void initElements() {
        lblTrenutnoStanje = new Label("Trenutno stanje: " + Baza.getInstance().getTrenutnoStanje() + " RSD");
        olTransakcije = FXCollections.observableList(Baza.getInstance().getTransakcije());
        tableView = new TableView<>(olTransakcije);
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        TableColumn<Transakcija, Integer> col1 = new TableColumn<>("Iznos");
        TableColumn<Transakcija, String> col2 = new TableColumn<>("Uplatilac/Primalac");
        TableColumn<Transakcija, LocalDate> col3 = new TableColumn<>("Datum");
        TableColumn<Transakcija, TipTransakcije> col4 = new TableColumn<>("Tip");
        col1.setCellValueFactory(new PropertyValueFactory<>("iznos"));
        col2.setCellValueFactory(new PropertyValueFactory<>("uplatilacPrimalac"));
        col3.setCellValueFactory(new PropertyValueFactory<>("datum"));
        col4.setCellValueFactory(new PropertyValueFactory<>("tipTransakcije"));
        tableView.getColumns().addAll(col1, col2, col3, col4);
        btnNovaIsplata = new Button("Nova isplata");
        btnPregledIsplata = new Button("Pregled isplata");
        hBoxDugmici = new HBox();
        snimi = new Button("Snimi");
    }

    public Label getLblTrenutnoStanje() {
        return lblTrenutnoStanje;
    }

    public TableView<Transakcija> getTableView() {
        return tableView;
    }

    public ObservableList<Transakcija> getOlTransakcije() {
        return olTransakcije;
    }

    public Button getBtnNovaIsplata() {
        return btnNovaIsplata;
    }

    public Button getBtnPregledIsplata() {
        return btnPregledIsplata;
    }

    public HBox gethBoxDugmici() {
        return hBoxDugmici;
    }
}
