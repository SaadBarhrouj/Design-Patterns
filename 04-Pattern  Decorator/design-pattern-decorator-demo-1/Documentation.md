# **Démo : Pattern Decorator**

## **1. Introduction**

Cette démonstration illustre l'utilisation du **Design Pattern Decorator** en Java. Le pattern Decorator permet d'ajouter dynamiquement des comportements ou des fonctionnalités à un objet sans modifier sa structure. Il est particulièrement utile pour étendre les fonctionnalités d'une classe de manière flexible et réutilisable.

Dans cette démo, nous modélisons des boissons (comme `Espresso`, `Deca`, `Sumatra`) et des décorateurs (comme `Caramel`, `Chocollat`) pour ajouter des ingrédients supplémentaires à ces boissons.

---

## **2. Structure de la Démo**

La démo est organisée en deux packages principaux :

- **`boissons`** : Contient les classes de base pour les boissons.
- **`decorators`** : Contient les classes pour les décorateurs qui ajoutent des fonctionnalités aux boissons.

---

### **2.1. Package `boissons`**

#### **Classe `Boisson` (Abstraite)**
- **Description** : Classe de base pour toutes les boissons.
- **Attributs** :
  - `description` : Une chaîne de caractères décrivant la boisson.
- **Méthodes** :
  - `cout()` : Méthode abstraite pour calculer le coût de la boisson.
  - `getDescription()` : Retourne la description de la boisson.

#### **Classes Concrètes (`Deca`, `Espresso`, `Sumatra`)**
- **Description** : Ces classes représentent des boissons spécifiques.
- **Méthodes** :
  - `cout()` : Retourne le coût de la boisson.

---

### **2.2. Package `decorators`**

#### **Classe `AbstractDecorator` (Abstraite)**
- **Description** : Classe de base pour tous les décorateurs.
- **Attributs** :
  - `boisson` : La boisson à décorer.
- **Méthodes** :
  - `getDescription()` : Méthode abstraite pour obtenir la description de la boisson décorée.

#### **Classes Concrètes (`Caramel`, `Chocollat`)**
- **Description** : Ces classes représentent des décorateurs spécifiques.
- **Méthodes** :
  - `getDescription()` : Ajoute l'ingrédient à la description de la boisson.
  - `cout()` : Ajoute le coût de l'ingrédient au coût total de la boisson.

---

## **3. Exemple d'Utilisation**

### **Classe `Main`**

La classe `Main` démontre comment utiliser les décorateurs pour personnaliser une boisson.

```java
import boissons.Boisson;
import boissons.Espresso;
import decorators.Caramel;
import decorators.Chocollat;

public class Main {
    public static void main(String[] args) {
        // Création d'une boisson de base (Espresso)
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");

        // Ajout de chocolat à la boisson
        boisson = new Chocollat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");

        // Ajout de caramel à la boisson
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");

        // Ajout de caramel supplémentaire à la boisson
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("*******************************************");
    }
}