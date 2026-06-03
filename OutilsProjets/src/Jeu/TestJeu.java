/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Jeu;

import java.util.ArrayList;
import java.util.Random;
import tools.Clavier;
import tools.Outils;
import static tools.Outils.GRAINE;

/**
 *
 * @author eguiller
 */
public class TestJeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("graine ?");
        int graine = Clavier.getInt();
        Random generateur = new Random(graine);

        Tuile t = new Tuile(generateur, 4);
//        System.out.println(t.getType());
//        System.out.println(t);

        Colonne col = new Colonne(generateur, 10, 4);
        System.out.println(col);

        Plateau plateau = new Plateau(generateur, 10, 10, 4);
        System.out.print(plateau);

        while()
        System.out.println(plateau.posMatchVertical());

    }

}
