package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox, 400, 400);

        stage.setTitle("Calculator");

        TextField textField = new TextField();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(14));
        vbox.getChildren().add(textField);

        GridPane gridPane = new GridPane();

        MyBttn b1 = new MyBttn("1");
        MyBttn b2 = new MyBttn("2");
        MyBttn b3 = new MyBttn("3");
        MyBttn b4 = new MyBttn("4");
        MyBttn b5 = new MyBttn("5");
        MyBttn b6 = new MyBttn("6");
        MyBttn b7 = new MyBttn("7");
        MyBttn b8 = new MyBttn("8");
        MyBttn b9 = new MyBttn("9");
        MyBttn b0 = new MyBttn("0");

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.addRow(0, b7, b8, b9, b0);
        gridPane.addRow(1, b4, b5, b6);
        gridPane.addRow(2, b1, b2, b3);

        gridPane.setPadding(new Insets(10, 10, 10, 10));

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(33);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(33);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(33);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(33);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(33);

        GridPane.setVgrow(b7, Priority.ALWAYS);
        GridPane.setVgrow(b4, Priority.ALWAYS);
        GridPane.setVgrow(b1, Priority.ALWAYS);

        gridPane.getRowConstraints().addAll(row1, row2, row3);


        gridPane.getColumnConstraints().addAll(col1, col2, col2, col2);


        gridPane.setAlignment(Pos.CENTER);

        vbox.getChildren().add(gridPane);

        stage.setScene(scene);
        stage.show();
    }
}
