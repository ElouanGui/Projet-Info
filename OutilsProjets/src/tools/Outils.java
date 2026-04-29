/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Random;

/**
 *
 * @author cvarnier
 */
public class Outils {
    final static public long GRAINE = 1;
    final static public Random generateur = new Random(GRAINE);
    
    
    public static final String RESET =  "\u001B[0m";
    public static final String BLACK =  "\u001B[30m";
    public static final String RED =    "\u001B[31m";
    public static final String GREEN =  "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE =   "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN =   "\u001B[36m";
    public static final String WHITE =  "\u001B[37m";
        
    public static void afficheAvecCouleur(String txt, String color){          
            System.out.print(color+txt+RESET);
    }
    
// carre 25A0 , losange : 25C6 , rond : 25CF , étoile : 2605 , triangle : 25B2
// pique : 2660 , treffle : 2663 , coeur : 2665 , carreau : 2666 , fleur : 2740
// flocon : 2744/2746
    public static final String CARRE = "\u25A0";
    public static final String LOSANGE = "\u25C6";
    public static final String ROND = "\u25CF";
    public static final String ETOILE = "\u2605";
    public static final String TRIANGLE = "\u25B2";
    public static final String PIQUE = "\u2660";
    public static final String TREFLE = "\u2663";
    public static final String COEUR = "\u2665";
    public static final String CARREAU = "\u2666";
    public static final String FLEUR = "\u2740";
    public static final String FLOCON = "\u2744";

    
    public static void attente(double secondes) {
        long tempsCourant = System.nanoTime();
        long time = 0;
        long nanosecondes = (long) (secondes * 1_000_000_000.0);
        do {
            time = System.nanoTime();
        }
        while (time - tempsCourant < nanosecondes);
    }

}
