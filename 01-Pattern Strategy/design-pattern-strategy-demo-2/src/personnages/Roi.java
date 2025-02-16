package personnages;

import strategies.ComportementArcEtFleche;
import strategies.ComportementArmeDefault;
import strategies.ComportementHache;
import strategies.ComportementPoignard;

public class Roi extends Personnage {
public Roi() {
    this.comportementArme=new ComportementArmeDefault();
}
    @Override
    public void combattre(){
         score+=20;
        System.out.println("combatre du roi");
        comportementArme.UtiliserArme();
        System.out.println( "Score = " + score);
        if (score>=20){
            this.setComportementArme(new ComportementHache());
        }
        if (score>=100){
            this.setComportementArme(new ComportementPoignard());
        }
        if (score>=200){
            this.setComportementArme(new ComportementArcEtFleche());
        }
    };
}
