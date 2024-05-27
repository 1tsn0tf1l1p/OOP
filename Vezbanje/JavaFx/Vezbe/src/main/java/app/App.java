package app;

import app.view.RegistracijaView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene sc = new Scene(new RegistracijaView());
        stage.setScene(sc);
        stage.show();
    }
}
