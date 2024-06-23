package app.view;

import app.model.Baza;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Prozor2 extends VBox {
    private ComboBox<String> comboBox;
    private TextField tfPocetak2;
    private TextField tfKraj2;
    private Label crtica;
    private Button btnPretrazi;
    private TableView tv;
    private Button btnSnimi;
    private HBox hbox1;
    private Prozor1 prozor1;
    private Stage stage;

    public Prozor2(Prozor1 prozor1, Stage stage) {
        this.prozor1 = prozor1;
        this.stage = stage;
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
    }

    private void addElements() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setPadding(new Insets(15, 5, 15, 5));
        hbox1.setAlignment(Pos.CENTER);
        hbox1.setSpacing(15);
        hbox1.setPadding(new Insets(15, 5, 15, 5));

        hbox1.getChildren().addAll(comboBox, tfPocetak2, crtica, tfKraj2);
        this.getChildren().addAll(hbox1, btnPretrazi, tv, btnSnimi);
    }

    private void initElements() {
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(Baza.getInstance().getSviTipovi());
        comboBox.getItems().add("Sve");
        tfPocetak2 = new TextField();
        tfKraj2 = new TextField();
        crtica = new Label("-");
        btnPretrazi = new Button("Pretrazi");
        tv = new TableView<>();
        btnSnimi = new Button("Snimi");
        hbox1 = new HBox();
    }

    public ComboBox getComboBox() {
        return comboBox;
    }

    public TextField getTfPocetak2() {
        return tfPocetak2;
    }

    public TextField getTfKraj2() {
        return tfKraj2;
    }

    public Label getCrtica() {
        return crtica;
    }

    public Button getBtnPretrazi() {
        return btnPretrazi;
    }

    public TableView getTv() {
        return tv;
    }

    public Button getBtnSnimi() {
        return btnSnimi;
    }

    public HBox getHbox1() {
        return hbox1;
    }

    public Prozor1 getProzor1() {
        return prozor1;
    }

    public Stage getStage() {
        return stage;
    }
}
