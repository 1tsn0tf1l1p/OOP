package app.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PregledIsplataProzor extends VBox {
    private Label minimalnaIsplata;
    private Label maksimalnaIsplata;
    private ListView<String> listView;
    private Button btnZatvori;
    private Map<String, Integer> mapa;
    private int min;
    private int max;
    private Stage stage;

    public PregledIsplataProzor(Map<String, Integer> mapa, int min, int max, Stage stage) {
        this.mapa = mapa;
        this.min = min;
        this.max = max;
        this.stage = stage;
        initElements();
        addElements();
        addActions();
    }

    private void addActions() {
        btnZatvori.setOnAction(e -> {
            this.stage.close();
        });
    }

    private void addElements() {
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(15));
        this.setSpacing(15);
        this.getChildren().addAll(minimalnaIsplata, maksimalnaIsplata, listView, btnZatvori);
    }

    private void initElements() {
        minimalnaIsplata = new Label("Minimalna isplata: " + this.min);
        maksimalnaIsplata = new Label("Maksimalna isplata: " + this.max);

        List<String> elementi = new ArrayList<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : mapa.entrySet()) {
            elementi.add(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }

        listView = new ListView<>();
        listView.getItems().addAll(elementi);
        btnZatvori = new Button("Zatvori");
    }
}
