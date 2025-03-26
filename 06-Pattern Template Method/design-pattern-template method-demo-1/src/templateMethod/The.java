package templateMethod;

import templateMethod.Boisson;

public class The extends Boisson {

    @Override
    protected void ajouterIngredientPrincipal() {
        System.out.println("Ajout de feuilles de thé");
    }

    @Override
    protected void ajouterSupplement() {
        System.out.println("Ajout de citron");
    }
}