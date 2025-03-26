class Arrete implements EtatLecteur {
    public void cliquerPlay() {
        System.out.println("▶️ Lance la musique !");
        // Change l'état vers "EnLecture"
    }

    public void cliquerStop() {
        System.out.println("⏹️ Déjà arrêté !");
    }
}