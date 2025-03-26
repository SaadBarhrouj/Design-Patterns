package facade.subsystem;

public class VerificationFonds {
    public boolean verifierDisponibilite(String compteBancaire, double montant) {
        System.out.println("Vérification des fonds pour le compte " + compteBancaire);
        // (Logique réelle de vérification des fonds ici)
        return true; // Simulé pour l'exemple
    }
}