package decorators;

import boissons.Boisson;

/**
 * Classe représentant un décorateur de type "Chocolat".
 * Ajoute du chocolat à une boisson de base.
 */
public class Chocollat extends AbstractDecorator {

    /**
     * Constructeur de la classe Chocollat.
     *
     * @param boisson La boisson à décorer avec du chocolat.
     */
    public Chocollat(Boisson boisson) {
        super(boisson);
    }

    /**
     * Retourne la description de la boisson avec l'ajout de chocolat.
     *
     * @return La description de la boisson décorée.
     */
    @Override
    public String getDescription() {
        return boisson.getDescription() + " Chocollat";
    }

    /**
     * Retourne le coût de la boisson avec l'ajout de chocolat.
     *
     * @return Le coût total de la boisson décorée.
     */
    @Override
    public double cout() {
        return 0.7 + boisson.cout();
    }
}