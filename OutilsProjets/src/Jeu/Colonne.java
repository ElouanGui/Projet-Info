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
    
    public boolean existeMatch(Coord (col, lig)){
        boolean res= false;
        if (this.lesColonnes[col].get(lig-1).type
                ==this.lesColonnes[col].get(lig).type
                && this.lesColonnes[col].get(lig-1).type
                ==this.lesColonnes[col].get(lig+1).type ){
            res=true;
        }
        if ()                                                   // si le point renseigné a pour ordonnée la 1ere ou dernière valeur de la liste 
            }
    
}
