public class Main {
    public static void main(String[] args) {
        Etudiant etudiant = new EtudiantBuilder()
                .withNom("Saad")
                .withAge(23)
                .withUniversite("Ensa Tetouan")
                .withEmail("saad.barhrouj@etu.uae.ac.ma")
                .addCentreInteret("Informatique")
                .addCentreInteret("Musique")
                .build();

        System.out.println("Étudiant créé : " + etudiant.getNom());
    }
}