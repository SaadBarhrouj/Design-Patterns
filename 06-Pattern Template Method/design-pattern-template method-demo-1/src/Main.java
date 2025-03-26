import templateMethod.Boisson;
import templateMethod.Cafe;
import templateMethod.The;

public class Main {
    public static void main(String[] args) {
        Boisson the = new The();
        System.out.println("Préparation du thé :");
        the.preparer();

        Boisson cafe = new Cafe();
        System.out.println("\nPréparation du café :");
        cafe.preparer();
    }
}