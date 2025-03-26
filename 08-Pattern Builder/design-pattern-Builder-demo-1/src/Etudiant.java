import java.util.List;

class Etudiant {
    private String nom;
    private int age;
    private String universite;
    private String email;
    private List<String> centresInteret;

    // Constructeur horrible avec trop de paramètres !
    public Etudiant(String nom, int age, String universite, String email, List<String> centresInteret) {
        this.nom = nom;
        this.age = age;
        this.universite = universite;
        this.email = email;
        this.centresInteret = centresInteret;
    }
    public String getNom() {
        return nom;
    }
}