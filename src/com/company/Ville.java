package com.company;

/**
 * La classe Ville initie une nouvelle Ville
 *
 * @author Ghis
 * @version 1.0
 */

public class Ville {
    /**
     * Le nom de la ville.
     *
     * @see Ville#getNomVille();
     * @see Ville#setNomVille(String);
     */
    protected String nomVille;

    /**
     * Le nom du Pays où se situe la ville.
     *
     * @see Ville#getNomPays() ;
     * @see Ville#setNomPays(String) ;
     */
    protected String nomPays;


    /**
     * Le nombre d'habitants que contient la ville.
     *
     * @see Ville#getNbreHabitants() ;
     * @see Ville#setNbreHabitants(int) ;
     */
    protected int nbreHabitants;


    /**
     * Constructeur Ville :
     * <p>
     * A la construction de l'objet Ville, le nom de la ville, du pays est défini comme "Inconnu". Le nombre d'habitants est fixé à zéro.
     * <p>
     * nomVille est le nom de la ville.
     * <p>
     * nomPays est le nom du pays où est située la ville.
     * <p>
     * nbreHabitants est le nombre d'habitants de la ville.
     * </p>
     */
    public Ville() {
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitants = 0;
    }

    /**
     * Constructeur Ville avec paramètres :
     * <p>
     * A la construction de l'objet Ville, le nom de la ville, du pays est défini comme "Inconnu". Le nombre d'habitants est fixé à zéro.
     *
     * @param pNom  est le nom de la ville.
     * @param pPays est le nom du pays où est située la ville.
     * @param pNbre est le nombre d'habitants de la ville.
     *              </p>
     */
    public Ville(String pNom, int pNbre, String pPays) {
        System.out.println("Création d'une ville avec paramètres !");

        nomVille = pNom;
        nomPays = pPays;
        nbreHabitants = pNbre;
    }

    // GETTERS

    /**
     * @return le nom de la ville.
     */

    public String getNomVille() {
        return nomVille;
    }

    /**
     * @return le nom du Pays où se situe la ville.
     */
    public String getNomPays() {
        return nomPays;
    }

    /**
     * @return lle nombre d'habitants de la ville.
     */
    public int getNbreHabitants() {
        return nbreHabitants;
    }

    //SETTERS

    /**
     * Met à jour le nom de la ville.
     *
     * @param pNom Le nouveau nom de la ville.
     */
    public void setNomVille(String pNom) {
        nomVille = pNom;
    }

    /**
     * Met à jour le nom du pays.
     *
     * @param pPays Le nouveau nom du Pays.
     */
    public void setNomPays(String pPays) {
        nomPays = pPays;
    }

    /**
     * met à jour le nombre d'habitants de la ville.
     *
     * @param pNbre Le nouveau nombre d'habitants de la ville.
     */

    public void setNbreHabitants(int pNbre) {
        nbreHabitants = pNbre;
    }

    public String toString() {
        return nomVille + ", située en " + nomPays + " et comprenant " + nbreHabitants + " habitants.";
    }
}

