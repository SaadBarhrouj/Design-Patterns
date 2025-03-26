package composite;

public class TestComposite {
    public static void main(String[] args) {
        // Création du dossier racine
        Folder root = new Folder("Root : /");

        // Création de sous-dossiers
        Folder documents = new Folder("Documents");
        Folder images = new Folder("Images");
        Folder projets = new Folder("Projets");
        Folder code = new Folder("Code");

        // Création de fichiers
        File cv = new File("CV.pdf");
        File photo = new File("photo.jpg");
        File notes = new File("notes.txt");
        File mainJava = new File("Main.java");
        File readme = new File("README.md");

        // Ajout des dossiers à la racine
        root.addChild(documents);
        root.addChild(images);
        root.addChild(projets);

        // Ajout des fichiers aux dossiers
        documents.addChild(cv);
        documents.addChild(notes);

        images.addChild(photo);

        projets.addChild(code);
        code.addChild(mainJava);
        code.addChild(readme);

        // Affichage de la structure
        root.print();
    }
}