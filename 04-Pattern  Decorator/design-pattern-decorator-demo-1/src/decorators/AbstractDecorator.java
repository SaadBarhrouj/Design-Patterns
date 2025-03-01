package decorators;

import boissons.Boisson;

/**
 * Classe abstraite représentant un décorateur de boisson.
 * Elle hérite de `Boisson` et permet d'ajouter dynamiquement des fonctionnalités
 * (comme des ingrédients supplémentaires) à une boisson de base.
 */
public abstract class AbstractDecorator extends Boisson {
    protected Boisson boisson; // La boisson à décorer

    /**
     * Constructeur de la classe AbstractDecorator.
     *
     * @param boisson La boisson à décorer.
     */
    public AbstractDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    /**
     * Méthode abstraite pour obtenir la description de la boisson décorée.
     * Doit être implémentée par les classes dérivées.
     *
     * @return La description de la boisson décorée.
     */
    public abstract String getDescription();
}