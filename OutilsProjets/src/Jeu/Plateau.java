/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jeu;

/**
 *
 * @author eguiller
 */
public class Plateau {
    private Colonne[] lesColonnes;
    private int nbCol;
    private int nbLig;
    private int nbTypesTuiles;
    
    
    public Plateau(int nbCol, int nbLig, int nbTypes){
        this.nbCol=nbCol;
        this.nbLig=nbLig;
        this.nbTypesTuiles=nbTypesTuiles;
        this.lesColonnes=new Colonne [nbCol];
        for (int i =0; i<this.nbCol;i++){
            this.lesColonnes[i]=new Colonne(nbLig,nbTypes);
        }
    }
    
    public String toString(){
        String str="";
        for(int col=0; col<this.nbCol;col++){
            for(int col=0; col<this.nbCol;col++){
                str+=this.getTuiles(col, lig);
            }
        str+="\n";
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
                if (this.existeMatch(new Coord(col,lig))){
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

