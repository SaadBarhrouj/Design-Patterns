package templateMethod;

public abstract class Boisson {

    // Template method : définit le squelette de la préparation
    public final void preparer() {
        bouillirEau();
        ajouterIngredientPrincipal();
        verserDansTasse();
        ajouterSupplement(); // Méthode facultative
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    protected abstract void ajouterIngredientPrincipal();

    // Méthodes concrètes (communes)
    private void bouillirEau() {
        System.out.println("Ébullition de l'eau");
    }

    private void verserDansTasse() {
        System.out.println("Versement dans la tasse");
    }

    // Méthode "hook" facultative (peut être surchargée ou non)
    protected void ajouterSupplement() {
        // Implémentation par défaut (ne rien faire)
    }
}