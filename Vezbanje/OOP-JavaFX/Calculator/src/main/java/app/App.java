package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();
        GridPane gridPane = new GridPane();
        stage.setTitle("Calculator");
        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("*");
        Button b4 = new Button("/");
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(b1, 0, 0);
        gridPane.add(b2, 0, 1);
        gridPane.add(b3, 0, 2);
        gridPane.add(b4, 0, 3);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(20, 20, 20, 20));
        TextField tf = new TextField();
        vBox.getChildren().add(tf);
        vBox.getChildren().add(gridPane);

        Scene scene1 = new Scene(vBox);
        stage.setScene(scene1);
        stage.show();
    }
}
