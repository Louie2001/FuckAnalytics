/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.louie.fuckanalytics.main;

import me.louie.fuckanalytics.model.Programm;

/**
 *
 * @author walle
 */
public class Main {
    
    public static void main(String[] args){
        Programm programm = new Programm();
        programm.Start("Katzen", "KatzenNomen.txt", "KatzenVerben.txt");
    }
            
    
    
    
    
}
