package me.louie.fuckanalytics.model;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programm {

    public void Start(String Hauptwort, String NomenDatei, String VerbenDatei) {

        String Wort2 = this.gibZufallsWort(NomenDatei, this.gibLänge(NomenDatei));
        String Wort3 = this.gibZufallsWort(VerbenDatei, this.gibLänge(VerbenDatei));
        Suchanfrage(Hauptwort, Wort3, Wort2);

    }

    /**
     * Gibt die Zeilenanzahl der übergebenen Liste zurück.
     *
     * @param dateiname
     * @return
     */
    public int gibLänge(String dateiname) {
        int länge = 0;
        File file = new File(dateiname);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(dateiname));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                länge++;
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        return länge;

    }

    /**
     * Sucht die drei Keyörter bei Google.
     *
     * @param Keyword1
     * @param Keyword2
     * @param Keyword3
     */
    public void Suchanfrage(String Keyword1, String Keyword2, String Keyword3) {
        URL url = null;
        try {
            url = new URL("http://www.google.de/search?q=" + Keyword1 + "%20" + Keyword2 + "%20" + Keyword3);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(url.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * Gibt ein Zufälliges Wort aus der Datei zurück.Die Länge der Datei muss
     * übergeben werden.
     *
     * @param dateiname
     * @param DateiLänge
     * @return
     */
    public String gibZufallsWort(String dateiname, int DateiLänge) {
        Random ran = new Random();
        int RandomZahl = ran.nextInt(DateiLänge - 1);
        File file = new File(dateiname);
        BufferedReader in = null;
        String zeile = null;
        try {
            in = new BufferedReader(new FileReader(dateiname));
            for (int i = 0; i < RandomZahl; i++) {
                in.readLine();
            }
            zeile = in.readLine();

        } catch (IOException e) {
            e.printStackTrace();

        }

        return zeile;
    }

    /**
     * Gibt den Inhalt der gesamten Datei aus.
     *
     * @param dateiname
     */
    public void leseDateien(String dateiname) {
        File file = new File(dateiname);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(dateiname));
            String zeile = null;
            while ((zeile = in.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
