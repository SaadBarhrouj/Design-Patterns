public class Main {
    public static void main(String[] args) {
        LecteurMP3 lecteur = new LecteurMP3(); // État: Arrete

        lecteur.cliquerPlay(); // ▶️ Lance la musique !
        lecteur.cliquerPlay(); // ⏸️ Met en pause.
        lecteur.cliquerStop(); // ⏹️ Arrête la musique.
        lecteur.cliquerStop(); // ⏹️ Déjà arrêté !
    }
}