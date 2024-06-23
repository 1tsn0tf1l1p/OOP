package app.view;

import app.controller.PrikaziController;
import app.controller.SnimiUkupnoController;
import app.controller.StatistikaController;
import app.controller.UnesiController;
import app.model.Student;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends VBox {
    private Label lblTermin;
    private ComboBox<String> cbTermin;
    private Button btnPrikazi;
    private Button btnStatistika;
    private Button btnSnimiUkupno;
    private TableView<Student> tv;
    private Label lblUmlPoeni;
    private TextField tfUmlPoeni;
    private Label lblRangeUml;
    private Button btnUnesi;
    private HBox hboxUp;
    private HBox hboxDown;
    private TableColumn<Student, String> colIme;
    private TableColumn<Student, String> colPrezime;
    private TableColumn<Student, Double> colPoeniMoodle;
    private TableColumn<Student, Double> colPoeniUml;

    public MainWindow() {
        initElements();
        adElements();
        addActions();
    }

    private void addActions() {
        btnStatistika.setOnAction(new StatistikaController(this));
        btnPrikazi.setOnAction(new PrikaziController(this));
        btnUnesi.setOnAction(new UnesiController(this));
        btnSnimiUkupno.setOnAction(new SnimiUkupnoController(this));
    }

    private void adElements() {
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(10, 0, 10, 0));
        hboxUp.setSpacing(15);
        hboxUp.setAlignment(Pos.CENTER);
        hboxUp.setPadding(new Insets(10, 0, 10, 0));
        hboxDown.setSpacing(15);
        hboxDown.setAlignment(Pos.CENTER);
        hboxDown.setPadding(new Insets(10, 0, 10, 0));

        hboxUp.getChildren().addAll(lblTermin, cbTermin, btnPrikazi, btnStatistika, btnSnimiUkupno);
        hboxDown.getChildren().addAll(lblUmlPoeni, tfUmlPoeni, lblRangeUml, btnUnesi);

        this.getChildren().addAll(hboxUp, tv, hboxDown);

    }

    private void initElements() {
        lblTermin = new Label("Termin");
        cbTermin = new ComboBox<>();
        btnPrikazi = new Button("Prikazi");
        btnStatistika = new Button("Statistika");
        btnSnimiUkupno = new Button("Snimi ukupno");
        tv = new TableView<>();
        lblUmlPoeni = new Label("UML poeni");
        tfUmlPoeni = new TextField();
        lblRangeUml = new Label("(0-3)");
        btnUnesi = new Button("Unesi");
        hboxUp = new HBox();
        hboxDown = new HBox();

        // ---------------------------------------------------

        cbTermin.getItems().addAll("termin 1", "termin 2");

        // ---------------------------------------------------

        colIme = new TableColumn<>("Ime");
        colPrezime = new TableColumn<>("Prezime");
        colPoeniMoodle = new TableColumn<>("Poeni moodle");
        colPoeniUml = new TableColumn<>("Poeni UML");
        tv.getColumns().addAll(colIme, colPrezime, colPoeniMoodle, colPoeniUml);

        colIme.setCellValueFactory(new PropertyValueFactory<>("ime"));
        colPrezime.setCellValueFactory(new PropertyValueFactory<>("prezime"));
        colPoeniMoodle.setCellValueFactory(new PropertyValueFactory<>("poeniMoodle"));
        colPoeniUml.setCellValueFactory(new PropertyValueFactory<>("poeniUml"));

    }

    public Label getLblTermin() {
        return lblTermin;
    }

    public void setLblTermin(Label lblTermin) {
        this.lblTermin = lblTermin;
    }

    public ComboBox<String> getCbTermin() {
        return cbTermin;
    }

    public void setCbTermin(ComboBox<String> cbTermin) {
        this.cbTermin = cbTermin;
    }

    public Button getBtnPrikazi() {
        return btnPrikazi;
    }

    public void setBtnPrikazi(Button btnPrikazi) {
        this.btnPrikazi = btnPrikazi;
    }

    public Button getBtnStatistika() {
        return btnStatistika;
    }

    public void setBtnStatistika(Button btnStatistika) {
        this.btnStatistika = btnStatistika;
    }

    public Button getBtnSnimiUkupno() {
        return btnSnimiUkupno;
    }

    public void setBtnSnimiUkupno(Button btnSnimiUkupno) {
        this.btnSnimiUkupno = btnSnimiUkupno;
    }

    public TableView<Student> getTv() {
        return tv;
    }

    public void setTv(TableView<Student> tv) {
        this.tv = tv;
    }

    public Label getLblUmlPoeni() {
        return lblUmlPoeni;
    }

    public void setLblUmlPoeni(Label lblUmlPoeni) {
        this.lblUmlPoeni = lblUmlPoeni;
    }

    public TextField getTfUmlPoeni() {
        return tfUmlPoeni;
    }

    public void setTfUmlPoeni(TextField tfUmlPoeni) {
        this.tfUmlPoeni = tfUmlPoeni;
    }

    public Label getLblRangeUml() {
        return lblRangeUml;
    }

    public void setLblRangeUml(Label lblRangeUml) {
        this.lblRangeUml = lblRangeUml;
    }

    public Button getBtnUnesi() {
        return btnUnesi;
    }

    public void setBtnUnesi(Button btnUnesi) {
        this.btnUnesi = btnUnesi;
    }

    public HBox getHboxUp() {
        return hboxUp;
    }

    public void setHboxUp(HBox hboxUp) {
        this.hboxUp = hboxUp;
    }

    public HBox getHboxDown() {
        return hboxDown;
    }

    public void setHboxDown(HBox hboxDown) {
        this.hboxDown = hboxDown;
    }

    public TableColumn<Student, String> getColIme() {
        return colIme;
    }

    public void setColIme(TableColumn<Student, String> colIme) {
        this.colIme = colIme;
    }

    public TableColumn<Student, String> getColPrezime() {
        return colPrezime;
    }

    public void setColPrezime(TableColumn<Student, String> colPrezime) {
        this.colPrezime = colPrezime;
    }

    public TableColumn<Student, Double> getColPoeniMoodle() {
        return colPoeniMoodle;
    }

    public void setColPoeniMoodle(TableColumn<Student, Double> colPoeniMoodle) {
        this.colPoeniMoodle = colPoeniMoodle;
    }

    public TableColumn<Student, Double> getColPoeniUml() {
        return colPoeniUml;
    }

    public void setColPoeniUml(TableColumn<Student, Double> colPoeniUml) {
        this.colPoeniUml = colPoeniUml;
    }
}
