package app.controller;

import app.model.Baza;
import app.model.Student;
import app.view.MainWindow;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class SnimiUkupnoController implements EventHandler<ActionEvent> {
    private MainWindow mainWindow;

    public SnimiUkupnoController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Baza.getInstance().sortirajBazu();
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Ispit_JUN-grupa2v2/src/main/resources/ukupno.txt");
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Student student : Baza.getInstance().getStudenti()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(student.getIme() + ", " + student.getPrezime() + ", " + student.getEmail() +
                        ", " + student.getUkupno()).append("\n");
                bufferedWriter.write(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
