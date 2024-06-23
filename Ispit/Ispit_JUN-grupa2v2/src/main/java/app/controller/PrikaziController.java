package app.controller;

import app.model.Baza;
import app.model.Student;
import app.view.MainWindow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PrikaziController implements EventHandler<ActionEvent> {
    MainWindow mainWindow;

    public PrikaziController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        ObservableList<Student> studentiZaIzabraniTermin = FXCollections.observableArrayList();
        String termin = this.mainWindow.getCbTermin().getSelectionModel().getSelectedItem();
        for (Student student : Baza.getInstance().getStudenti()) {
            if(student.getTermin().equals(termin)) {
                studentiZaIzabraniTermin.add(student);
            }
        }
        this.mainWindow.getTv().getItems().addAll(studentiZaIzabraniTermin);
    }
}
