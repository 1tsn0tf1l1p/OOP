package app;

import app.model.Baza;
import app.view.MainWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Baza.getInstance();
        Scene scene = new Scene(new MainWindow());
        stage.setScene(scene);
        stage.show();
    }
}
