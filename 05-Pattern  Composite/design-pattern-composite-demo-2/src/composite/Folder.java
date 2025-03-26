package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private  List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab += "\t";
        }
        System.out.println(tab + "Folder: " + name);

        // Affiche récursivement tous les enfants
        for (Component component : components) {
            component.print();
        }
    }

    // Ajoute un enfant et définit son niveau
    public Component addChild(Component component) {
        component.level = this.level + 1;
        components.add(component);
        return component;
    }
}