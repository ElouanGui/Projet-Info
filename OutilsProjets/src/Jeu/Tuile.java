/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

import java.util.ArrayList;
import tools.Outils;
import java.util.Random;

/**
 *
 * @author eguiller
 */
public class Tuile {
    
    private int type;
    
    //private Coord position;
    
    public Tuile(int nbTypes){
        //this.type = Outils.generateur.nextInt(3);
        Random random = new Random();
        this.type = random.nextInt(nbTypes);
    }

    public int getType() {
        return this.type;
    }
    
    public String toString(){
        ArrayList<String> symboles;
        symboles = new ArrayList<String>();
        symboles.add(Outils.CARRE);
        symboles.add(Outils.LOSANGE);
        symboles.add(Outils.ROND);
        symboles.add(Outils.ETOILE);
        symboles.add(Outils.TRIANGLE);
        symboles.add(Outils.COEUR);
        ArrayList<String> couleurs;
        couleurs = new ArrayList<String>();
        couleurs.add(Outils.RED);
        couleurs.add(Outils.GREEN);
        couleurs.add(Outils.YELLOW);
        couleurs.add(Outils.BLUE);
        couleurs.add(Outils.PURPLE);
        couleurs.add(Outils.CYAN);
        //Outils.afficheAvecCouleur(symboles.get(this.type),couleurs.get(this.type));
        return couleurs.get(this.type) + symboles.get(this.type);
    }
}
