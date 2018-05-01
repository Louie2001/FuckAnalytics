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
}
