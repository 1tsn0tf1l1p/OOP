package app.controller;

import app.model.Baza;
import app.model.Drzava;
import app.model.Vanzemaljac;
import app.view.MainProzor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SacuvajController implements EventHandler<ActionEvent> {
    private MainProzor mainProzor;

    public SacuvajController(MainProzor mainProzor) {
        this.mainProzor = mainProzor;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        File file = new File("/home/filip/Documents/RAF/1godina/OOP/Ispit/Vanzemaljci/src/main/resources/regije.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            //Map<String, Integer> kontinentBroj = new HashMap<>();

            for (String s : Baza.getInstance().getKontinenti()) {
                if(s.equals("Svi kontinenti")) {
                    continue;
                }
                int brojac = 0;
                for (Vanzemaljac vanzemaljac : Baza.getInstance().getVanzemaljci()) {
                    if(vanzemaljac.getKontinent().equals(s)) {
                        brojac++;
                    }
                }
                //kontinentBroj.put(s, brojac);
                bufferedWriter.write(s + ": " + brojac);
                bufferedWriter.newLine();
            }

            //for (Map.Entry<String, Integer> entry : kontinentBroj.entrySet()) {
              //bufferedWriter.write(entry.getKey() + ": " + entry.getValue());
              //bufferedWriter.newLine();
            //}

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to save data to file: " + file.getAbsolutePath(), e);
        }
    }
}
