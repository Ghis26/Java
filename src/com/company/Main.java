package com.company;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char response = ' ';
        ArrayList al = new ArrayList();

        do {

            Ville maVille = new Ville(); // création d'une nouvelle ville

            System.out.println("Veuillez saisir le nom de la ville :");
            maVille.setNomVille(sc.next());
            System.out.println("Veuillez saisir le nom du Pays :");
            maVille.setNomPays(sc.next());
            System.out.println("Veuillez saisir le nombre d'Habitants :");
            maVille.setNbreHabitants(sc.nextInt());

            System.out.println(maVille.toString()); // affiche le nom et les caractéristiques de la ville créée

            al.add(maVille); // ajoute maVille au tableau al

            System.out.println("Villes actuellement créées : "); // Affiche toutes les villes crées et stockées dans le tableau
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));
            }

            Quartier monQuartier = new Quartier(); // création d'un nouveau quartier

            System.out.println("Veuillez saisir le nombre de maisons situées dans le quartier : ");
            monQuartier.setNbreMaisons(sc.nextInt());
            System.out.println("Veuillez saisir le nom du bureau de Tabac du Quartier : ");
            monQuartier.setNomBureauTabac(sc.next());

            System.out.println(monQuartier.toString()); // affiche les caractéristiques du quartier

            al.add(monQuartier); // ajoute le quartier dans le tableau


            System.out.println("Souhaitez-vous créer une nouvelle ville ?  (O/N)");

            response = sc.next().charAt(0);

        } while (response == 'O');

        System.out.println("A bientôt !");
    }

}
