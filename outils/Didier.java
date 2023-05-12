package outils;

import outils.modules.Fonctions;

public class Didier {
    /* EXERCICE
     * Dans cette classe, ajouter une méthode nommée 'exercice' (qui 
     * ne sera pas une méthode static)
     * qui utilise la méthode 'ecrire' de la classe Fonctions pour 
     * afficher "bonjour je m'appelle ..."
     * 
     * Dans le fichier Main.java, appelez la méthode 'exercice'
     * qui est déclarée dans votre classe.
     */
    public void exercice() {
        Fonctions.ecrire("bonjour je m'appelle Didier");
    }
}