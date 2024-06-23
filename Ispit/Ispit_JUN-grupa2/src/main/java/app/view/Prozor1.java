package app.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Prozor1 extends VBox {
    private Label lblTermin;
    private ComboBox cb;
    private Button btnPrikazi;
    private Button btnStatistika;
    private Button btnSnimiUkupno;
    private TableView tv;
    private Label lblUmlPoeni;
    private TextField tfUmlPoeni;
    private Label lblUmlPoeniLimiter;
    private Button btnUnesi;
    private HBox hBox1;
    private HBox hBox2;

    public Prozor1() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
    }

    private void addElements() {
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(15, 0, 15, 0));
        hBox1.setSpacing(15);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPadding(new Insets(5));
        hBox2.setSpacing(15);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setPadding(new Insets(5));

        hBox1.getChildren().addAll(lblTermin, cb, btnPrikazi, btnStatistika, btnSnimiUkupno);
        hBox2.getChildren().addAll(lblUmlPoeni, tfUmlPoeni, lblUmlPoeniLimiter, btnUnesi);

        this.getChildren().addAll(hBox1, tv, hBox2);
    }

    private void initElements() {
        lblTermin = new Label("Termin");
        cb = new ComboBox<>();
        btnPrikazi = new Button("Prikazi");
        btnStatistika = new Button("Statistika");
        btnSnimiUkupno = new Button("Snimi Ukupno");
        tv = new TableView<>();
        lblUmlPoeni = new Label("UML Poeni");
        lblUmlPoeniLimiter = new Label("(0-3)");
        btnUnesi = new Button("Unesi");
        tfUmlPoeni = new TextField();
        hBox1 = new HBox();
        hBox2 = new HBox();
    }
}
