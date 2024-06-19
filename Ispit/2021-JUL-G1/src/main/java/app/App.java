package app;

import app.model.Baza;
import app.view.PrviProzor;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        Baza.getInstance();
        System.out.println(Baza.getInstance().getKategorije());
        System.out.println(Baza.getInstance().getTransakcije());
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new PrviProzor());
        stage.setScene(scene);
        stage.setTitle("OOP - ispit jul");
        stage.show();
    }
}
