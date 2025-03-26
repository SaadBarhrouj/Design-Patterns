package composite;

public abstract class Component {
    protected String name;
    protected int level = 0;

    public Component(String name) {
        this.name = name;
    }

    // Méthode abstraite pour afficher le composant
    public abstract void print();
}