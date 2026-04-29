/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tools;

/**
 *
 * @author cvarnier
 */
public class TestClavier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("voici un exemple d'utilisation des saisies claviers (de la classe Clavier)");
        System.out.println("entrer au clavier un entier :");
        int valeurIntSaisie = Clavier.getInt();
        System.out.println("vous avez saisie : "+valeurIntSaisie);

        System.out.println("entrer au clavier un booléen :");
        boolean valeurBoolSaisie = Clavier.getBoolean();
        System.out.println("vous avez saisie : "+valeurBoolSaisie);

        System.out.println("entrer au clavier un texte :");
        String valeurStringSaisie = Clavier.getString();
        System.out.println("vous avez saisie : "+valeurStringSaisie);
    }
    
}
