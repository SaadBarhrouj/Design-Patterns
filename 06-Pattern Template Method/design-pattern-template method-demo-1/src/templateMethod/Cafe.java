package templateMethod;

import templateMethod.Boisson;

public class Cafe extends Boisson {

    @Override
    protected void ajouterIngredientPrincipal() {
        System.out.println("Ajout de café moulu");
    }
}