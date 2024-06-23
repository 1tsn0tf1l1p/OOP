package app.controller;

import app.model.Baza;
import app.model.Pitanje;
import app.model.PitanjeStatistika;
import app.model.Student;
import app.view.MainWindow;
import app.view.StatistikaWindow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Map;

public class StatistikaController implements EventHandler<ActionEvent> {
    private MainWindow mainWindow;

    public StatistikaController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Stage stage = new Stage();
        StatistikaWindow window = new StatistikaWindow();
        Scene scene = new Scene(window);
        stage.setScene(scene);
        stage.show();

        String termin = this.mainWindow.getCbTermin().getSelectionModel().getSelectedItem();
        ObservableList<PitanjeStatistika> pitanjeStatistikaObservableList = FXCollections.observableArrayList();

        if(termin.equals("termin 1")) {
            for (Pitanje pitanje : Baza.getInstance().getPitanjaTermin1()) {
                String nazivPitanja = pitanje.getOznakaPitanja();
                Double maksPoena = pitanje.getMaxPoena();
                Double ukupanBrojPoenaZaPitanje = 0.0;
                int ukupanBrojLjudi = 0;
                Double ukupanBrojLjudiMaxPoena = 0.0;
                for (Student student : Baza.getInstance().getStudenti()) {
                    if(student.getTermin().equals("termin 1")) {
                        for (Map.Entry<Pitanje, Double> pitanjeDoubleEntry : student.getOsvojeniPoeni().entrySet()) {
                            if(pitanje.equals(pitanjeDoubleEntry.getKey())) {
                                ukupanBrojPoenaZaPitanje += pitanjeDoubleEntry.getValue();
                                ukupanBrojLjudi++;
                                if(pitanje.getMaxPoena() == pitanjeDoubleEntry.getValue()) {
                                    ukupanBrojLjudiMaxPoena++;
                                }
                            }
                        }
                    }
                }
                PitanjeStatistika pitanjeStatistika = new PitanjeStatistika(nazivPitanja, maksPoena, (ukupanBrojPoenaZaPitanje/ukupanBrojLjudi), (ukupanBrojLjudiMaxPoena/ukupanBrojLjudi)*100);
                pitanjeStatistikaObservableList.add(pitanjeStatistika);
            }
        }
        else {
            for (Pitanje pitanje : Baza.getInstance().getPitanjaTermin1()) {
                String nazivPitanja = pitanje.getOznakaPitanja();
                Double maksPoena = pitanje.getMaxPoena();
                Double ukupanBrojPoenaZaPitanje = 0.0;
                int ukupanBrojLjudi = 0;
                Double ukupanBrojLjudiMaxPoena = 0.0;
                for (Student student : Baza.getInstance().getStudenti()) {
                    if(student.getTermin().equals("termin 2")) {
                        for (Map.Entry<Pitanje, Double> pitanjeDoubleEntry : student.getOsvojeniPoeni().entrySet()) {
                            if(pitanje.equals(pitanjeDoubleEntry.getKey())) {
                                ukupanBrojPoenaZaPitanje += pitanjeDoubleEntry.getValue();
                                ukupanBrojLjudi++;
                                if(pitanje.getMaxPoena() == pitanjeDoubleEntry.getValue()) {
                                    ukupanBrojLjudiMaxPoena++;
                                }
                            }
                        }
                    }
                }
                PitanjeStatistika pitanjeStatistika = new PitanjeStatistika(nazivPitanja, maksPoena, (ukupanBrojPoenaZaPitanje/ukupanBrojLjudi), (ukupanBrojLjudiMaxPoena/ukupanBrojLjudi)*100);
                pitanjeStatistikaObservableList.add(pitanjeStatistika);
            }
        }

        window.getTv().setItems(pitanjeStatistikaObservableList);

    }
}
