package me.louie.fuckanalytics.model;

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

    private boolean running = true;
    private String Hauptwort;
    private String VerbenDatei;   
    private String NomenDatei;

    public void run() {
        while(running){
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(5000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Programm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Var.programm.Start(Hauptwort, NomenDatei, VerbenDatei);
        }

    }
    
    /**
     * Stoppt die Methode die run-Methode des Threads.
     */
    public void kill(){
        running = false;
        
        
    }
    
    
    public void setParameters(String Hauptwort,String VerbenDatei,String NomenDatei){
        this.Hauptwort = Hauptwort;
        this.VerbenDatei = VerbenDatei;
        this.NomenDatei = NomenDatei;
    
}
    
    

}
