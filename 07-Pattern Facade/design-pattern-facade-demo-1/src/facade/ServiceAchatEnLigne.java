package facade;

import facade.subsystem.VerificationFonds;
import facade.subsystem.PaiementService;
import facade.subsystem.NotificationService;

public class ServiceAchatEnLigne {
    private VerificationFonds verificationFonds;
    private PaiementService paiementService;
    private NotificationService notificationService;

    public ServiceAchatEnLigne() {
        this.verificationFonds = new VerificationFonds();
        this.paiementService = new PaiementService();
        this.notificationService = new NotificationService();
    }

    public void acheterArticle(String compteBancaire, double montant) {
        System.out.println("Début du processus d'achat...");

        if (verificationFonds.verifierDisponibilite(compteBancaire, montant)) {
            paiementService.effectuerPaiement(compteBancaire, montant);
            notificationService.envoyerNotification(compteBancaire, "Achat réussi !");
        } else {
            System.out.println("Fonds insuffisants !");
            notificationService.envoyerNotification(compteBancaire, "Achat échoué : Fonds insuffisants");
        }

        System.out.println("Processus d'achat terminé.");
    }
}