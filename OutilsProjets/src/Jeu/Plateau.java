/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

import tools.Outils;

/**
 *
 * @author eguiller
 */
public class Plateau {
    private Colonne[] lesColonnes;
    private int nbCol;
    private int nbLig;
    private int nbTypes;
    
    
    public Plateau(int nbCol, int nbLig, int nbTypes){
        this.nbCol=nbCol;
        this.nbLig=nbLig;
        this.nbTypes=nbTypes;
        this.lesColonnes=new Colonne [nbCol];
        for (int i=0; i<this.nbCol; i++){
            this.lesColonnes[i]=new Colonne(nbLig,nbTypes);
        }
    }
    
    //public Tuile getTuile(Coord coord){
    //    return this.lesColonnes[coord.getCol()].get(coord.getLig());
    //}
    
    public String toString(){
        String str="";
        for(int lig=this.nbLig-1;lig>=0;lig--){
            if (lig>9){
                str += Outils.BLACK + lig + " | ";
            }else{
                str += Outils.BLACK + " " + lig + " | ";
            }
            for(int col=0; col<this.nbCol;col++){
                str+=this.lesColonnes[col].getTuile(lig) + "  ";
            }
            str+="\n";
        }
        str += "    ";
        for(int col=0;col<3*this.nbCol;col++){
            str += "-";            
        }
        str+="\n";
        str+="    ";
        if (this.nbCol>9){
                str += " ";
            }
        for (int col = 0;col<this.nbCol;col++){
            str += Outils.BLACK + col + "  ";
        }
        return str;
    }
    
    public Coord posMatchVertical(){
        Coord pos = new Coord(-1,-1);
        int col=0;
        boolean trouve = false;
        while (col<this.nbCol && !trouve){
            int lig=0;
            while (lig<this.nbLig-2 && !trouve){
                if (this.lesColonnes[col].existeMatch(new Coord(col,lig))){
                    trouve=true;
                    pos=new Coord(col,lig);
                }else{
                    lig++;
                }
            }
            col++;
        }
        return pos;
    }
    
    


}

