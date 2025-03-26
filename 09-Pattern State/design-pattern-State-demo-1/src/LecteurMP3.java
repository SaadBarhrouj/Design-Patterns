class LecteurMP3 {
    private EtatLecteur etat;

    public LecteurMP3() {
        this.etat = new Arrete(); // État initial
    }

    // Délègue l'action à l'état courant
    public void cliquerPlay() {
        etat.cliquerPlay();
    }

    public void cliquerStop() {
        etat.cliquerStop();
    }

    // Permet de changer d'état
    public void setEtat(EtatLecteur nouvelEtat) {
        this.etat = nouvelEtat;
    }
}