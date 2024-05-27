package view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class ButoniView extends VBox {

    private Button bttnPrikaz;
    private Label registar;

    public ButoniView() {
        sizeIt();
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        bttnPrikaz.setOnMouseEntered(e -> {
            registar.setText("Usli ste u regiju dugmeta");
        });
        bttnPrikaz.setOnMouseExited(e -> {
            registar.setText("Niste vise u regiji dugmeta");
        });
        bttnPrikaz.setOnMouseClicked(e -> {
            registar.setText("KLIKNULI STE NA DUGME");
        });
        this.setOnKeyPressed(e -> {
            if(e.isControlDown() && e.getCode() == KeyCode.C) {
                registar.setText("KLIKNUTO");
            }
        });
    }

    private void sizeIt() {
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.setAlignment(Pos.CENTER);
    }

    private void addElements() {
        this.getChildren().addAll(bttnPrikaz, registar);
    }

    private void initElements() {
        bttnPrikaz = new Button("Dugme");
        registar = new Label("Nema akcije");
    }
}
