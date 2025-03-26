import java.util.ArrayList;
import java.util.List;

class EtudiantBuilder {
    private String nom;
    private int age;
    private String universite;
    private String email;
    private List<String> centresInteret = new ArrayList<>();

    public EtudiantBuilder withNom(String nom) {
        this.nom = nom;
        return this; // Retourne le builder lui-même (permet le chaînage)
    }

    public EtudiantBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public EtudiantBuilder withUniversite(String universite) {
        this.universite = universite;
        return this;
    }

    public EtudiantBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public EtudiantBuilder addCentreInteret(String interet) {
        this.centresInteret.add(interet);
        return this;
    }

    public Etudiant build() {
        return new Etudiant(nom, age, universite, email, centresInteret);
    }
}