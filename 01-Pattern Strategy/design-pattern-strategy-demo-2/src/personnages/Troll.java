package personnages;

import strategies.ComportementArmeDefault;

public class Troll extends Personnage {

    public Troll() {
        this.comportementArme=new ComportementArmeDefault();
    }
    @Override
    public void combattre(){
        System.out.println("combatre du Troll");
        score+=3;
        comportementArme.UtiliserArme();
        System.out.println( "Score = " + score);

    };
}