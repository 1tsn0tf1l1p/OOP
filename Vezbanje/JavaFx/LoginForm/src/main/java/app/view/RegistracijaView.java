package app.view;

import app.model.Baza;
import app.model.Korisnik;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class RegistracijaView extends VBox {
    private Label registracija;
    private GridPane registracijaGrid;
    private Label lbIme;
    private Label lbPrezime;
    private Label lbEmail;
    private Label lbLozinka;
    private Label nakonRegistracije;
    private TextField tfIme;
    private TextField tfPrezime;
    private TextField tfEmail;
    private PasswordField tfLozinka;
    private Button btnRegistrujSe;
    private TextField logInEmail;
    private PasswordField logInPassword;
    private Button btnLogIn;
    private Label nakonLogIna;

    public RegistracijaView() {
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        EventHandler<ActionEvent> ehRegistrujSe = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String unetoIme = tfIme.getText();
                String unetoPrezime = tfPrezime.getText();
                String unetiEmail = tfEmail.getText();
                String unetaLozinka = tfLozinka.getText();

                if(!(unetiEmail.contains("@gmail.com") || unetiEmail.contains("@yahoo.com") || unetiEmail.contains("@outlook.com"))) {
                    nakonRegistracije.setText("Email u losem formatu!");
                    return;
                }

                Korisnik korisnik = new Korisnik(unetoIme, unetoPrezime, unetiEmail, unetaLozinka);
                if(Baza.getInstance().getRegistrovaniKorisnici().contains(korisnik)) {
                    nakonRegistracije.setText("Uneti podaci su vec registrovani!");
                }
                else {
                    Baza.getInstance().getRegistrovaniKorisnici().add(korisnik);
                    nakonRegistracije.setText("Upesno ste se registrovali!");
                    System.out.println("Registrovani korisnici: " + korisnik.toString());
                    tfIme.clear();
                    tfPrezime.clear();
                    tfEmail.clear();
                    tfLozinka.clear();

                    try {
                        PrintWriter printWriter = new PrintWriter("registrovani.txt");

                        printWriter.write(korisnik.toString());
                        printWriter.close();

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };
        btnRegistrujSe.setOnAction(ehRegistrujSe);

        this.setOnKeyPressed(e -> {
            if(e.isControlDown() && e.getCode() == KeyCode.S) {
                String unetoIme = tfIme.getText();
                String unetoPrezime = tfPrezime.getText();
                String unetiEmail = tfEmail.getText();
                String unetaLozinka = tfLozinka.getText();

                if(!(unetiEmail.contains("@gmail.com") || unetiEmail.contains("@yahoo.com") || unetiEmail.contains("@outlook.com"))) {
                    nakonRegistracije.setText("Email u losem formatu!");
                    return;
                }

                Korisnik korisnik = new Korisnik(unetoIme, unetoPrezime, unetiEmail, unetaLozinka);
                if(Baza.getInstance().getRegistrovaniKorisnici().contains(korisnik)) {
                    nakonRegistracije.setText("Uneti podaci su vec registrovani!");
                }
                else {
                    Baza.getInstance().getRegistrovaniKorisnici().add(korisnik);
                    nakonRegistracije.setText("Upesno ste se registrovali!");
                    System.out.println("Registrovani korisnici: " + korisnik.toString());
                    tfIme.clear();
                    tfPrezime.clear();
                    tfEmail.clear();
                    tfLozinka.clear();

                    try {
                        PrintWriter printWriter = new PrintWriter("registrovani.txt");

                        printWriter.write(korisnik.toString());
                        printWriter.close();

                    } catch (FileNotFoundException eer) {
                        throw new RuntimeException(eer);
                    }

                }
            }

        });

        btnLogIn.setOnAction(e ->{
            String email = logInEmail.getText();
            String psswd = logInPassword.getText();

            Korisnik korisnik = null;
            for(Korisnik k : Baza.getInstance().getRegistrovaniKorisnici()) {
                if(k.getEmail().equals(email) && k.getPassword().equals(psswd)) {
                    for(Korisnik k1 : Baza.getInstance().getUlogovaniKorisnici()) {
                        if(k1.getEmail().equals(k.getEmail()) && k1.getPassword().equals(k.getPassword())) {
                            nakonLogIna.setText("Vec ste ulogovani!");
                            return;
                        }
                    }
                }
                else {
                    nakonLogIna.setText("Ovaj korisnik nije registrovan.");
                    return;
                }
                korisnik = k;
            }

            if(!(korisnik==null)) {
                Baza.getInstance().getUlogovaniKorisnici().add(korisnik);
                System.out.println("Ulogovan korisnik: " + korisnik.getIme() + " " + korisnik.getPrezime() + " " + korisnik.getEmail());
                nakonLogIna.setText("Ulogovani ste!");

                Scene mainScene = new Scene(new MainView(), 600, 600);
                Stage mainStage = new Stage();
                mainStage.setScene(mainScene);
                mainStage.setTitle("Platforma");
                mainStage.show();

            }else {
                nakonLogIna.setText("Lista registrovanih korisnika je prazna!");
            }
        });
    }

    private void addElements() {
        this.setSpacing(20);
        this.setPadding(new Insets(20, 20, 20, 20));
        this.getChildren().add(registracija);

        registracijaGrid.setVgap(7);
        registracijaGrid.setHgap(20);
        registracijaGrid.addRow(0, lbIme, tfIme);
        registracijaGrid.addRow(1, lbPrezime, tfPrezime);
        registracijaGrid.addRow(2, lbEmail, tfEmail);
        registracijaGrid.addRow(3, lbLozinka, tfLozinka);
        this.getChildren().add(registracijaGrid);

        this.getChildren().add(btnRegistrujSe);

        this.getChildren().add(nakonRegistracije);

        logInEmail.setMaxWidth(267);
        logInPassword.setMaxWidth(267);
        this.getChildren().add(logInEmail);
        this.getChildren().add(logInPassword);
        this.getChildren().add(btnLogIn);
        this.getChildren().add(nakonLogIna);

    }

    private void initElements() {
        registracija = new Label("Registracija");
        lbIme = new Label("Ime:");
        lbPrezime = new Label("Prezime:");
        lbEmail = new Label("Email:");
        lbLozinka = new Label("Lozinka:");
        tfIme = new TextField();
        tfPrezime = new TextField();
        tfEmail = new TextField();
        tfLozinka = new PasswordField();
        btnRegistrujSe = new Button("Registracija");
        logInEmail = new TextField();
        logInPassword = new PasswordField();
        btnLogIn = new Button("Log In");
        registracijaGrid = new GridPane();
        nakonRegistracije = new Label("");
        nakonLogIna = new Label("");
    }
}
