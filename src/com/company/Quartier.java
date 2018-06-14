package com.company;

/**
 * La class Quartier initie un nouveau quartier, qui est une extension de la class Ville
 *
 * @author Ghis
 * @version 1.0
 */

public class Quartier extends Ville{

    /**
     *Définit le nombre de maisons composant le quartier.
     *
     * @see Quartier#getNbreMaisons() ;
     * @see Quartier#setNbreMaisons(int);
     */
    protected int nbreMaisons;

    /**
     * Définit le nom du bureau de tabac situé dans le quartier.
     *
     * @see Quartier#getNomBureauTabac();
     * @see Quartier#setNomBureauTabac(String);
     */
    protected String nomBureauTabac;

    /** constructeur par défaut
     */
    public Quartier () {
        System.out.println("Création d'un quartier : ");
        nbreMaisons = 0;
        nomBureauTabac = " ";
    }

    /**
     * @return le nombre de maisons qui composent le quartier.
     */
    public int getNbreMaisons() {
        return nbreMaisons;
    }

    /**
     * @param nbreMaisons
     */
    public void setNbreMaisons(int nbreMaisons) {
        this.nbreMaisons = nbreMaisons;
    }

    /**
     *
     * @return le nom du bureau de Tabac qui est situé dans le quartier
     */
    public String getNomBureauTabac (){
        return nomBureauTabac;
    }


    /**
     * @param nomBureauTabac
     */
    public void setNomBureauTabac(String nomBureauTabac) {
        this.nomBureauTabac = nomBureauTabac;
    }

    public String toString(){
     return nbreMaisons + " maisons composent ce quartier, avec un bureau de Tabac nommé " + nomBureauTabac;
    }
}
