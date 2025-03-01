import boissons.Boisson;
import boissons.Espresso;
import decorators.Caramel;
import decorators.Chocollat;

/**
 * Classe principale pour tester la composition des boissons et des décorateurs.
 */
public class Main {
    public static void main(String[] args) {
        // Création d'une boisson de base (Espresso)
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");
        System.out.println("*******************************************");

        // Ajout de chocolat à la boisson
        boisson = new Chocollat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");
        System.out.println("*******************************************");

        // Ajout de caramel à la boisson
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");
        System.out.println("*******************************************");

        // Ajout de caramel supplémentaire à la boisson
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");
        System.out.println("*******************************************");
    }
}