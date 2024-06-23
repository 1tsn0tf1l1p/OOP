package app.view;

import app.controller.FiltrirajController;
import app.controller.SacuvajController;
import app.controller.UpisiController;
import app.model.Baza;
import app.model.Vanzemaljac;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainProzor extends VBox {
    private Label lblKontinent;
    private ComboBox<String> cbKontinent;
    private CheckBox checkBoxPronadjen;
    private Label checkBoxPronadjenLabel;
    private CheckBox checkBoxIzgubljen;
    private Label checkBoxIzgubljenLabel;
    private Button btnFiltriraj;
    private TableView<Vanzemaljac> tv;
    private TableColumn<Vanzemaljac, Integer> colId;
    private TableColumn<Vanzemaljac, String> colKontinent;
    private TableColumn<Vanzemaljac, String> colDrzava;
    private Label lblPronadjen;
    private ComboBox<String> cbDrzave;
    private Button btnUpisi;
    private Label lblPoruka;
    private Button btnSacuvaj;
    private HBox hbox1;
    private HBox hbox2;
    private VBox vBox1;

    public MainProzor() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnFiltriraj.setOnAction(new FiltrirajController(this));
        btnUpisi.setOnAction(new UpisiController(this));
        btnSacuvaj.setOnAction(new SacuvajController(this));
    }

    private void addElements() {
        this.setSpacing(15);
        this.setPadding(new Insets(15));
        this.setAlignment(Pos.CENTER);
        hbox1.setSpacing(15);
        hbox1.setPadding(new Insets(15));
        hbox1.setAlignment(Pos.CENTER);
        hbox1.getChildren().addAll(lblKontinent, cbKontinent, checkBoxPronadjen, checkBoxPronadjenLabel, checkBoxIzgubljen,
                checkBoxIzgubljenLabel, btnFiltriraj);
        hbox2.setSpacing(15);
        hbox2.setPadding(new Insets(15));
        hbox2.setAlignment(Pos.CENTER);
        vBox1.setSpacing(15);
        vBox1.setPadding(new Insets(15));
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(lblPronadjen, cbDrzave, btnUpisi, lblPoruka);
        hbox2.getChildren().addAll(tv, vBox1);
        this.getChildren().addAll(hbox1, hbox2, btnSacuvaj);
    }

    private void initElements() {
        lblKontinent = new Label("Kontinent");
        cbKontinent = new ComboBox<>();
        checkBoxPronadjen = new CheckBox();
        checkBoxPronadjenLabel = new Label("Pronadjen");
        checkBoxIzgubljenLabel = new Label("Izgubljen");
        checkBoxIzgubljen = new CheckBox();
        btnFiltriraj = new Button("Filtriraj");
        ObservableList<Vanzemaljac> olVanzemaljac = FXCollections.observableList(Baza.getInstance().getVanzemaljci());
        tv = new TableView<>(olVanzemaljac);
        lblPronadjen = new Label("Pronadjen");
        cbDrzave = new ComboBox<>();
        btnUpisi = new Button("Upisi");
        lblPoruka = new Label("Poruka");
        btnSacuvaj = new Button("Sacuvaj");
        hbox1 = new HBox();
        hbox2 = new HBox();
        vBox1 = new VBox();
        colId = new TableColumn<>("ID");
        colKontinent = new TableColumn<>("Kontinent");
        colDrzava = new TableColumn<>("Drzava");

        // ----------------------------------------

        cbKontinent.getItems().addAll(Baza.getInstance().getKontinenti());
        cbDrzave.getItems().addAll(Baza.getInstance().getDrzaveString());

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colKontinent.setCellValueFactory(new PropertyValueFactory<>("kontinent"));
        colDrzava.setCellValueFactory(new PropertyValueFactory<>("drzava"));

        // ----------------------------------------

        tv.getColumns().addAll(colId, colKontinent, colDrzava);
    }

    public Label getLblKontinent() {
        return lblKontinent;
    }

    public void setLblKontinent(Label lblKontinent) {
        this.lblKontinent = lblKontinent;
    }

    public ComboBox getCbKontinent() {
        return cbKontinent;
    }

    public void setCbKontinent(ComboBox cbKontinent) {
        this.cbKontinent = cbKontinent;
    }

    public CheckBox getCheckBoxPronadjen() {
        return checkBoxPronadjen;
    }

    public void setCheckBoxPronadjen(CheckBox checkBoxPronadjen) {
        this.checkBoxPronadjen = checkBoxPronadjen;
    }

    public Label getCheckBoxPronadjenLabel() {
        return checkBoxPronadjenLabel;
    }

    public void setCheckBoxPronadjenLabel(Label checkBoxPronadjenLabel) {
        this.checkBoxPronadjenLabel = checkBoxPronadjenLabel;
    }

    public CheckBox getCheckBoxIzgubljen() {
        return checkBoxIzgubljen;
    }

    public void setCheckBoxIzgubljen(CheckBox checkBoxIzgubljen) {
        this.checkBoxIzgubljen = checkBoxIzgubljen;
    }

    public Label getCheckBoxIzgubljenLabel() {
        return checkBoxIzgubljenLabel;
    }

    public void setCheckBoxIzgubljenLabel(Label checkBoxIzgubljenLabel) {
        this.checkBoxIzgubljenLabel = checkBoxIzgubljenLabel;
    }

    public Button getBtnFiltriraj() {
        return btnFiltriraj;
    }

    public void setBtnFiltriraj(Button btnFiltriraj) {
        this.btnFiltriraj = btnFiltriraj;
    }

    public TableView<Vanzemaljac> getTv() {
        return tv;
    }

    public void setTv(TableView<Vanzemaljac> tv) {
        this.tv = tv;
    }

    public TableColumn<Vanzemaljac, Integer> getColId() {
        return colId;
    }

    public void setColId(TableColumn<Vanzemaljac, Integer> colId) {
        this.colId = colId;
    }

    public TableColumn<Vanzemaljac, String> getColKontinent() {
        return colKontinent;
    }

    public void setColKontinent(TableColumn<Vanzemaljac, String> colKontinent) {
        this.colKontinent = colKontinent;
    }

    public TableColumn<Vanzemaljac, String> getColDrzava() {
        return colDrzava;
    }

    public void setColDrzava(TableColumn<Vanzemaljac, String> colDrzava) {
        this.colDrzava = colDrzava;
    }

    public Label getLblPronadjen() {
        return lblPronadjen;
    }

    public void setLblPronadjen(Label lblPronadjen) {
        this.lblPronadjen = lblPronadjen;
    }

    public ComboBox getCbDrzave() {
        return cbDrzave;
    }

    public void setCbDrzave(ComboBox cbDrzave) {
        this.cbDrzave = cbDrzave;
    }

    public Button getBtnUpisi() {
        return btnUpisi;
    }

    public void setBtnUpisi(Button btnUpisi) {
        this.btnUpisi = btnUpisi;
    }

    public Label getLblPoruka() {
        return lblPoruka;
    }

    public void setLblPoruka(Label lblPoruka) {
        this.lblPoruka = lblPoruka;
    }

    public Button getBtnSacuvaj() {
        return btnSacuvaj;
    }

    public void setBtnSacuvaj(Button btnSacuvaj) {
        this.btnSacuvaj = btnSacuvaj;
    }

    public HBox getHbox1() {
        return hbox1;
    }

    public void setHbox1(HBox hbox1) {
        this.hbox1 = hbox1;
    }

    public HBox getHbox2() {
        return hbox2;
    }

    public void setHbox2(HBox hbox2) {
        this.hbox2 = hbox2;
    }

    public VBox getvBox1() {
        return vBox1;
    }

    public void setvBox1(VBox vBox1) {
        this.vBox1 = vBox1;
    }
}
