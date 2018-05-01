package me.louie.fuckanalytics.var;

import me.louie.fuckanalytics.model.Programm;
import me.louie.fuckanalytics.model.ProgrammThread;

public class Var {

    /**
     * Das Programm.
     */
    public static Programm programm = new Programm();
    /**
     * Gibt in millisekunden an wie oft eine Seite geöffnet wird.(Mindest-Wert)
     */

    public static int SiteDelay_Min = 1000;
    /**
     * Gibt in millisekunden an wie oft eine Seite geöffnet wird.(Höchst-Wert)
     */

    public static int SiteDelay_Max = 10000;
    /**
     * Gibt an ob die Fenster automatisch geschlossen werden sollen.
     */
    public static boolean AutoClose = false;
    
    /**
     * Gibt an wo der CLOSE-Button des Browsers ist.(X-Koordinate)
     */
    
    public static int RobotCloseX = 1980;
    /**
     * Gibt an wo der CLOSE-Button des Browsers ist.(Y-Koordinate)
     */
    public static int RobotCloseY = 5;
    /**
     * Gibt an wie viele Fenster sich öffnen sollen bevor der Browser geschlossen wird.
     */
    public static int RunsTillClose = 10;
}
