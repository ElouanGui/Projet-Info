/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

import java.util.ArrayList;
import tools.Outils;

/**
 *
 * @author eguiller
 */
public class Tuile {
    
    private int type;
    
    //private Coord position;
    
    public Tuile(int nbTypes){
        this.type = Outils.generateur.nextInt(nbTypes);
    }

    public int getType() {
        return type;
    }
    
    
    
    
    public String ToString(){
        ArrayList<String> symboles;
        symboles = new ArrayList<String>();
        symboles.add(Outils.CARRE);
        symboles.add(Outils.LOSANGE);
        symboles.add(Outils.ROND);
        return symboles.get(type);
    }
}
