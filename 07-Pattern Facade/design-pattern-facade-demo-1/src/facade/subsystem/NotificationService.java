package facade.subsystem;

public class NotificationService {
    public void envoyerNotification(String compteBancaire, String message) {
        System.out.println("Notification envoyée au compte " + compteBancaire + ": " + message);
        // (Logique réelle d'envoi de notification ici)
    }
}