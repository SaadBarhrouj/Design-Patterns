package Tp1;

public class CompteBancaire {
    private  int numero;
    private double solde;
    private static int counter;
    Journalisation journalisation =Journalisation.getInstance();


    public CompteBancaire(double solde) {
       this.numero = ++counter;
       this.solde = solde;


    }

    public void  deposerArgent(double depot){
       if(depot>0){
           solde += depot;
           journalisation.ajouterLog("ajouter le solde de " + depot +" au compte "+ this.numero);
       }else {
           journalisation.ajouterLog(" impossible d'ajouter le solde negatif de " + depot +" au compte "+ this.numero);

       }
    }

    public void  retirerArgent(double retrait){
       if(retrait<=solde && retrait>0){
           solde -= retrait;
           journalisation.ajouterLog("retrait  le solde de " + retrait +"au compte numero "+ this.numero);
       }else{
           journalisation.ajouterLog("solde insuffisant ou montant a retirer negatif " + retrait +" au compte numero "+ this.numero);

       }

    }
}
