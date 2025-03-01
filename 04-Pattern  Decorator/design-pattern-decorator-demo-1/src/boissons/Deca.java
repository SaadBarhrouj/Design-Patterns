package boissons;

/**
 * Classe représentant une boisson de type "Deca".
 * Hérite de la classe `Boisson` et implémente un coût spécifique.
 */
public class Deca extends Boisson {

    /**
     * Constructeur de la classe Deca.
     * Initialise la description de la boisson à "Deca".
     */
    public Deca() {
        this.description = "Deca";
    }

    /**
     * Retourne le coût de la boisson Deca.
     *
     * @return Le coût de la boisson, fixé à 7 unités.
     */
    @Override
    public double cout() {
        return 7;
    }
}