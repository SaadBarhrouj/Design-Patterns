package boissons;

/**
 * Classe représentant une boisson de type "Sumatra".
 * Hérite de la classe `Boisson` et implémente un coût spécifique.
 */
public class Sumatra extends Boisson {

    /**
     * Constructeur de la classe Sumatra.
     * Initialise la description de la boisson à "Sumatra".
     */
    public Sumatra() {
        this.description = "Sumatra";
    }

    /**
     * Retourne le coût de la boisson Sumatra.
     *
     * @return Le coût de la boisson, fixé à 8 unités.
     */
    @Override
    public double cout() {
        return 8;
    }
}