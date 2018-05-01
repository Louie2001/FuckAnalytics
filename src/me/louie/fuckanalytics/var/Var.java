package me.louie.fuckanalytics.var;

import me.louie.fuckanalytics.model.Programm;
import me.louie.fuckanalytics.model.ProgrammThread;

public class Var {

    /**
     * Das Programm.
     */
    public static Programm programm = new Programm();
    /**
     * ProgrammThread der es ermöglicht das das Programm gestoppt werden
     * kann.(ZWeiter Thread)
     */
    public static ProgrammThread programmThread = new ProgrammThread();
    /**
     * Gibt in millisekunden an wie oft eine Seite geöffnet wird.(Mindest-Wert)
     */

    public static int SiteDelay_Min;
    /**
     * Gibt in millisekunden an wie oft eine Seite geöffnet wird.(Höchst-Wert)
     */

    public static int SiteDelay_Max;
}
