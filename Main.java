import outils.Personne;
import outils.modules.Fonctions;

public class Main {
    public static void main(String[] args){

        Wassim w = new Wassim();
        w.exercice();

    System.out.println("\n");

        System.out.println("Bonjour (main)");
        Fonctions.ecrire("ce texte est affiché avec la fonction ecrire");

        System.out.println("++++++++++++++++++++++");

        Nicolas nicolas = new Nicolas();
        nicolas.exercice();

        System.out.println("++++++++++++++++++++++");


        /** Lorsqu'on déclare une variable de type objet, on dit
         * que l'on fait une INSTANCIATION.
         * Un objet est une INSTANCE d'une classe. */  
        Personne p = new Personne("Onyme", "Anne", 50);
        // p.prenom = "Anne";
        // p.nom = "Onyme";
        // p.age = 50;
        System.out.println("Nom : " + p.nom);
        System.out.println("Prénom : " + p.prenom);
        System.out.println("Age : " + p.getAge());

        System.out.println(p.identite());
        Personne p1 = new Personne("Jean", "Cérien");
        // p1.prenom = "Jean";
        // p1.nom = "Cérien";
        p1.setAge(25);
        System.out.println("Identité de p1 :" + p1.identite());

        Personne[] tableauPersonnes = new Personne[10];
        for (int i = 0; i < tableauPersonnes.length; i++) {
            tableauPersonnes[i] = new Personne();
        }
        tableauPersonnes[0].prenom = "Gérard";
        tableauPersonnes[0].nom = "Menfin";
        tableauPersonnes[0].setAge(35);
        tableauPersonnes[1] = new Personne();
        tableauPersonnes[1].prenom = "Nordine";
        tableauPersonnes[1].nom = "Ateur";
        tableauPersonnes[1].setAge(20);

        for (Personne personne : tableauPersonnes) {
            System.out.println(personne.identite() + " " + personne.getAge());
        }
        System.out.println(tableauPersonnes[1].identite());
        /* NULL est un type de données particulier (qu'on peut considérer
            comme une valeur particulière). 
            Une variable de type objet qui n'a pas été initialisée 
            est considéré comme étant NULL.
         */
        System.out.println("\n\n\n\n\n\n");
        // Didier.exercice();
        Didier d = new Didier();
        d.exercice();
        System.out.println("utilisation git ----");
        Mouhab mouhab = new Mouhab();
        mouhab.exercice();

         

    }



}

