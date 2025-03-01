package boissons;

/**
 * Classe représentant une boisson de type "Espresso".
 * Hérite de la classe `Boisson` et implémente un coût spécifique.
 */
public class Espresso extends Boisson {

    /**
     * Constructeur de la classe Espresso.
     * Initialise la description de la boisson à "Espresso".
     */
    public Espresso() {
        this.description = "Espresso";
    }

    /**
     * Retourne le coût de la boisson Espresso.
     *
     * @return Le coût de la boisson, fixé à 6 unités.
     */
    @Override
    public double cout() {
        return 6;
    }
}