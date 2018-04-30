package me.louie.fuckanalytics.model;

import me.louie.fuckanalytics.var.Var;

/**
 * Diese Klasse ist notwendieg damit das Programm auch laufen kann während
 * Seiten geöffnet werden.
 *
 * @author walle
 */
public class ProgrammThread extends Thread {

    private boolean running = true;

    public void run() {

        Var.programm.Start("Katzen", "KatzenNomen.txt", "KatzenVerben.txt");

    }

}
