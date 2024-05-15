package app.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends VBox {

    private Label title;
    private ToggleGroup toggleGroup;
    private GridPane gridPane;
    private Label lblKomentar;
    private TextArea textArea;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private HBox hBox;

    public MainView() {
        initEelements();
        addElements();
    }

    private void addElements() {
        title.setAlignment(Pos.TOP_CENTER);
        this.getChildren().add(title);
        this.setPadding(new Insets(20));
        this.setSpacing(20);

        hBox.setAlignment(Pos.TOP_CENTER);
        hBox.setPadding(new Insets(20));
        hBox.setSpacing(20);

        hBox.getChildren().addAll(radioButton1, radioButton2, radioButton3, radioButton4, radioButton5);

        this.getChildren().add(hBox);

        this.getChildren().add(lblKomentar);
        this.getChildren().add(textArea);

    }

    private void initEelements() {
        toggleGroup = new ToggleGroup();
        gridPane = new GridPane();
        lblKomentar = new Label("Upisite komentar:");
        textArea = new TextArea();
        radioButton1 = new RadioButton("1");
        radioButton2 = new RadioButton("2");
        radioButton3 = new RadioButton("3");
        radioButton4 = new RadioButton("4");
        radioButton5 = new RadioButton("5");
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);
        radioButton4.setToggleGroup(toggleGroup);
        radioButton5.setToggleGroup(toggleGroup);
        title = new Label("Ocenite rad aplikacije:");
        hBox = new HBox();
    }
}
