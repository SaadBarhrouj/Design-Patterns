package personnages;

import strategies.ComportementArmeDefault;

public class Reine extends Personnage{
    public Reine() {
        this.comportementArme=new ComportementArmeDefault();
    }
    @Override
    public void combattre(){
        score+=8;
        System.out.println("combatre du reine");
        comportementArme.UtiliserArme();
        System.out.println( "Score = " + score);
    };
}
