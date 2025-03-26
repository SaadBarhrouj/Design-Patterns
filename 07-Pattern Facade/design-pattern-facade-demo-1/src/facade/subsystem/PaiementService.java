package facade.subsystem;

public class PaiementService {
    public void effectuerPaiement(String compteBancaire, double montant) {
        System.out.println("Paiement de " + montant + " effectué depuis le compte " + compteBancaire);
        // (Logique réelle de paiement ici)
    }
}