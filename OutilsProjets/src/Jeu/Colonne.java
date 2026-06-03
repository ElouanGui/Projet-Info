/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author eguiller
 */
public class Colonne {

    private ArrayList<Tuile> lesTuiles;

    public Colonne(Random generateur, int nbLig, int nbTypes) {
        lesTuiles = new ArrayList<Tuile>();
        for (int i = 0; i < nbLig; i++) {
            lesTuiles.add(new Tuile(generateur, nbTypes));
        }
    }

    public boolean existeMatch(Coord coord) {
        boolean res = false;
        int lig = coord.getLig();
        if (lig > this.lesTuiles.size() - 3) {
            res = false;
        } else {
            res = this.lesTuiles.get(lig).getType() == this.lesTuiles.get(lig + 1).getType()
                    && this.lesTuiles.get(lig).getType() == this.lesTuiles.get(lig + 2).getType();
        }
        return res;
    }

    public Tuile getTuile(int lig) {
        return this.lesTuiles.get(lig);
    }

    @Override
    public String toString() {
        String res = "Colonne{" + "lesTuiles=";
        for (int i = 0; i < this.lesTuiles.size(); i++) {
            res += this.lesTuiles.get(i);
        }
        return res;
    }

    
      public void supprimeTuile(Coord coord) {
        this.lesTuiles.remove(coord.getLig());
}
      
}
