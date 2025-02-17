import Tp1.CompteBancaire;
import Tp1.Journalisation;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compteBancaire = new CompteBancaire(200);
        compteBancaire.deposerArgent(300);
        compteBancaire.retirerArgent(300);
        compteBancaire.deposerArgent(-200);
        CompteBancaire compteBancaire2 = new CompteBancaire(1000);
        compteBancaire2.retirerArgent(500);
        compteBancaire2.deposerArgent(500);
        Journalisation journalisation = Journalisation.getInstance();
        journalisation.getLog();

    }
}