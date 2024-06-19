package app.controller;

import app.model.Baza;
import app.model.TipTransakcije;
import app.model.Transakcija;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.*;

public class SnimiController implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        // isplata
        File file = new File("isplate.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Transakcija transakcija : Baza.getInstance().getTransakcije()) {
                if(transakcija.getTipTransakcije().equals(TipTransakcije.ISPLATA)) {
                    bw.write(transakcija.getIznos() +";"+transakcija.getUplatilacPrimalac()+";"+transakcija.getDatum()+";"+transakcija.getKategorija());
                    bw.newLine();
                }
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file1 = new File("uplate.txt");
        try {
            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Transakcija transakcija : Baza.getInstance().getTransakcije()) {
                if(transakcija.getTipTransakcije().equals(TipTransakcije.UPLATA)) {
                    bw.write(transakcija.getIznos() +";"+transakcija.getUplatilacPrimalac()+";"+transakcija.getDatum());
                    bw.newLine();
                }
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
