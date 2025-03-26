class EnLecture implements EtatLecteur {
    public void cliquerPlay() {
        System.out.println("⏸️ Met en pause.");
        // Change l'état vers "EnPause"
    }

    public void cliquerStop() {
        System.out.println("⏹️ Arrête la musique.");
        // Change l'état vers "Arrete"
    }
}