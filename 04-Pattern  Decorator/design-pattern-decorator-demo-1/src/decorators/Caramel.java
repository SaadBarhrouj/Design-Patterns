package decorators;

import boissons.Boisson;

/**
 * Classe représentant un décorateur de type "Caramel".
 * Ajoute du caramel à une boisson de base.
 */
public class Caramel extends AbstractDecorator {

    /**
     * Constructeur de la classe Caramel.
     *
     * @param boisson La boisson à décorer avec du caramel.
     */
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    /**
     * Retourne la description de la boisson avec l'ajout de caramel.
     *
     * @return La description de la boisson décorée.
     */
    @Override
    public String getDescription() {
        return boisson.getDescription() + " Caramel";
    }

    /**
     * Retourne le coût de la boisson avec l'ajout de caramel.
     *
     * @return Le coût total de la boisson décorée.
     */
    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }
}