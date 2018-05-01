package me.louie.fuckanalytics.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Die Klasse verwaltet alle Threads und kennt den aktuellen Thread.
 * 
 * 
 * 
 * @author walle
 */
public class ThreadManager {
    public static ProgrammThread aktThread;
    
    
    
    public static void newThread(){
        ProgrammThread t = new ProgrammThread();
        aktThread = t;    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
