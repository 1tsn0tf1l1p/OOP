package app.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class RegistracijaView extends VBox {
    private Label lblRegistracija;
    private GridPane gp;
    private Label ime;
    private Label prezime;
    private Label email;
    private Label lozinka;
    private TextField tfime;
    private TextField tfprezime;
    private TextField tfemail;
    private PasswordField pwflozinka;
    private Button btnRegistruj;
    private Label lblprijava;
    private TextField tfpemail;
    private PasswordField pwprijavalozinka;
    private Button prijava;

    public RegistracijaView() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String unetoIme = tfime.getText();
                String unetoPrezime = tfprezime.getText();
            }
        };
    }

    private void addElements() {
        gp.addColumn(0, ime, prezime, email, lozinka);
        gp.addColumn(1, tfime, tfprezime, tfemail, pwflozinka);
        this.getChildren().addAll(lblRegistracija, gp, btnRegistruj, lblprijava, email, pwprijavalozinka);
    }

    private void initElements() {
        lblRegistracija = new Label("Registracija");
        gp = new GridPane();
        ime = new Label("Ime");
        prezime = new Label("Prezime");
        lozinka = new Label("Lozinka");
        tfime = new TextField();
        tfprezime = new TextField();
        tfemail = new TextField();
        pwflozinka = new PasswordField();
        btnRegistruj = new Button("Registruj");
        lblprijava = new Label("Prijava");
        tfpemail = new TextField();
        pwprijavalozinka = new PasswordField();
        prijava = new Button("Prijava");
        email = new Label("Email");
    }

}
