package app.controller;

import app.model.Baza;
import app.model.Student;
import app.view.MainWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class UnesiController implements EventHandler<ActionEvent> {
    private MainWindow mainWindow;

    public UnesiController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Student s = this.mainWindow.getTv().getSelectionModel().getSelectedItem();
        double brojPoena = Double.parseDouble(this.mainWindow.getTfUmlPoeni().getText());
        if(brojPoena < 0 || brojPoena > 3) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Broj poena je manji od nule ili veci od 3!");
            a.show();
            return;
        }
        for (Student student : Baza.getInstance().getStudenti()) {
            if(student.equals(s)) {
                student.setPoeniUml(brojPoena);
                this.mainWindow.getTv().refresh();
                return;
            }
        }

    }
}
