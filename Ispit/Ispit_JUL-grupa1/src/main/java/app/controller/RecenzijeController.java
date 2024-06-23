package app.controller;

import app.view.Prozor1;
import app.view.Prozor2;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RecenzijeController implements EventHandler<ActionEvent> {
    private Prozor1 prozor1;

    public RecenzijeController(Prozor1 prozor1) {
        this.prozor1 = prozor1;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Stage stage = new Stage();
        Scene scene = new Scene(new Prozor2(prozor1, stage));
        stage.setScene(scene);
        stage.show();
    }
}
