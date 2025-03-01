package boissons;

/**
 * Classe abstraite représentant une boisson générique.
 * Elle définit une structure commune pour toutes les boissons,
 * incluant une description et un coût.
 */
public abstract class Boisson {
    protected String description; // Description de la boisson

    /**
     * Méthode abstraite pour calculer le coût de la boisson.
     * Doit être implémentée par les classes dérivées.
     *
     * @return Le coût de la boisson.
     */
    public abstract double cout();

    /**
     * Retourne la description de la boisson.
     *
     * @return La description de la boisson.
     */
    public String getDescription() {
        return description;
    }
}