/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

import java.util.ArrayList;

/**
 *
 * @author eguiller
 */
public class Colonne {

    private ArrayList<Tuile> lesTuiles;
    
    public Colonne(int nbLig, int nbTypes){
        lesTuiles = new ArrayList<Tuile>();
        for (int i=0; i<nbLig; i++){
            lesTuiles.add(new Tuile(nbTypes));
        }
    }

    public boolean existeMatch(Coord coord) {
        boolean res = false;
        int lig = coord.getLig();
        if (this.lesTuiles.get(lig - 1).getType()
                == this.lesTuiles.get(lig).getType()
                && this.lesTuiles.get(lig - 1).getType()
                == this.lesTuiles.get(lig + 1).getType()) {
            res = true;
        }
        if (lig == this.lesTuiles.size() - 1 && this.lesTuiles.get(lig).getType()
                == this.lesTuiles.get(lig - 1).getType() // si le point renseigné a pour ordonnée la dernière valeur de la liste 
                && this.lesTuiles.get(lig).getType()
                == this.lesTuiles.get(lig - 2).getType()) {
            res = true;
        }
        if (lig == 0 && this.lesTuiles.get(lig).getType()
                == this.lesTuiles.get(lig + 1).getType() // si le point renseigné a pour ordonnée la 1ere valeur de la liste 
                && this.lesTuiles.get(lig).getType()
                == this.lesTuiles.get(lig + 2).getType()) {
            res = true;
        }

        return res;

    }
    
    public Tuile getTuile(int lig){
        return this.lesTuiles.get(lig);
    }

    @Override
    public String toString() {
        String res = "Colonne{" + "lesTuiles=";
        for (int i=0; i<this.lesTuiles.size(); i++){
            res += this.lesTuiles.get(i);
        }
        return res;
    }
    

}
