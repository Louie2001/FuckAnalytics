package me.louie.fuckanalytics.model;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.louie.fuckanalytics.var.Var;

/**
 * Diese Klasse ist notwendieg damit das Programm auch laufen kann während
 * Seiten geöffnet werden.
 *
 * @author walle
 */
public class ProgrammThread extends Thread {

    /**
     * Gibt an ob der Thread noch läuft.
     */
    private boolean running = true;
    /**
     * Das Haupwort für die Suchanfrage.
     */
    private String Hauptwort;
    /**
     * Der Name der VerbenDatei für die Suchanfrage.
     */
    private String VerbenDatei;
    /**
     * Der Name der NomenDatei für die Suchanfrage.
     */
    private String NomenDatei;
    /**
     * Der Roboter für das schließen des Browsers.
     */
    private Robot robot;
    /**
     * Die Anzahl der geöffneten Fenster.
     */
    private int Runs;
    /**
     * Gibt an ob AutoClick aktiv ist.
     */
    private boolean AutoClick;
    /**
     * Gibt an ob autoClose kativ ist.
     */

    private boolean AutoClose;

    /**
     * Die Hauptmethode des Threads von dem alle anderen Methoden aufgerufen
     * werden.
     */

    public void run() {
        Runs = 0;

        //Solange die Funktion läuft.
        while (running) {
            Random random = new Random();
            try {
                //Pause im Bereich des minimal und amximal Wertes.
                Thread.sleep(random.nextInt(Var.SiteDelay_Max - Var.SiteDelay_Min) + Var.SiteDelay_Min);
            } catch (InterruptedException ex) {
                Logger.getLogger(Programm.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (AutoClose) {
                if (Runs >= Var.RunsTillClose) {
                    try {
                        this.RobotClose();
                        Runs = 0;
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProgrammThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            Var.programm.Start(Hauptwort, NomenDatei, VerbenDatei);
            if (AutoClick) {
                try {
                    Thread.sleep(1500);
                    this.RobotClick();
                    Thread.sleep(1500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProgrammThread.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            Runs++;

        }

    }

    /**
     * Stoppt die Methode die run-Methode des Threads.
     */
    public void kill() {
        running = false;

    }

    /**
     * Setzt die Keywords für die spätere Ausführung.
     *
     * @param Hauptwort
     * @param VerbenDatei
     * @param NomenDatei
     */
    public void setParameters(String Hauptwort, String VerbenDatei, String NomenDatei) {
        this.Hauptwort = Hauptwort;
        this.VerbenDatei = VerbenDatei;
        this.NomenDatei = NomenDatei;

    }

    /**
     * Erstellt ein neues Objekt der Klasse Roboter.
     */
    public void createRobot() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(ProgrammThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * Schließt das Fenster.
     */

    public void RobotClose() {
        if (robot != null) {
            robot.mouseMove(Var.RobotCloseX, Var.RobotCloseY);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        }
    }

    /**
     *
     *
     * Klickt ein Ergebniss der Liste an.
     */

    public void RobotClick() {
        if (robot != null) {
            for(int i = 264;i<310;i++){
            robot.mouseMove(254, 704);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            i = i +10;
                
                
            }

        }
    }

    public void setAutoClick(boolean On) {
        this.AutoClick = On;

    }

    public void setAutoClose(boolean On) {
        this.AutoClose = On;

    }

}
