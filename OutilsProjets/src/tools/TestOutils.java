/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tools;

/**
 *
 * @author cvarnier
 */
public class TestOutils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("voici un exemple d'utilisation des outils de la classe Outils");
        int val, moyenne = 0;
        for (int i=0; i<20; i++) {
            val = Outils.generateur.nextInt(10);
            System.out.println("entier aléatoire entre 0 et 10 (non inclus) : " + val);
            moyenne += val;
        }
        System.out.println("moyenne = "+moyenne/20.0);
        
        System.out.println();
        System.out.println("Affichage en couleur : ");
        Outils.afficheAvecCouleur("bleu",Outils.BLUE);
        Outils.afficheAvecCouleur("vert",Outils.GREEN);
        Outils.afficheAvecCouleur("rouge",Outils.RED);
        Outils.afficheAvecCouleur("cyan\n",Outils.CYAN);
        System.out.println(Outils.BLACK+"noir ");
        System.out.println(Outils.BLUE+"bleu ");
        System.out.println(Outils.GREEN+"vert");
        System.out.println(Outils.RED+"rouge ");
        System.out.println(Outils.CYAN+"cyan");
        System.out.println(Outils.RESET+"...");
        
        System.out.println("Affichage de caractère forme :");
        System.out.println("CARRE = " + Outils.CARRE);
        System.out.println("LOSANGE = " + Outils.LOSANGE);
        System.out.println("ROND = " + Outils.ROND);
        System.out.println("ETOILE = " + Outils.ETOILE);
        System.out.println("TRIANGLE = " + Outils.TRIANGLE);
        System.out.println("PIQUE = " + Outils.PIQUE);
        System.out.println("TREFLE = " + Outils.TREFLE);
        System.out.println("COEUR = " + Outils.COEUR);
        System.out.println("CARREAU = " + Outils.CARREAU);
        System.out.println("FLEUR = " + Outils.FLEUR);
        System.out.println("FLOCON = " + Outils.FLOCON);
        
        
        
    }
    
}
