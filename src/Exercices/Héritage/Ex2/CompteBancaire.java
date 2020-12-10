package Exercices.Héritage.Ex2;
import java.util.Scanner;
public class CompteBancaire {
    protected long numero;
    protected double solde;
    public CompteBancaire(long numero, double solde){
        this.numero = numero;
        this.solde = solde;
    }
    public void Ajouter(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter la somme souhaite ajouter :");
        this.solde += myObj.nextDouble();
        System.out.println("le montant ajouter est :" +" "+ solde);
    }
    public void Retirer(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter la somme souhaite retirer :");
        double retirer = myObj.nextDouble();
        if(retirer > solde){
            System.out.println("Le montant insuffisant");
        }else {
            System.out.println( "Le solde restant est :"+" "+(solde - retirer));
        }

    }
    public void Afficher(){
        System.out.println("Numero de compte est :"+" "+numero);
        System.out.println("Solde :"+" "+solde);
    }
}
class CompteEpargne extends CompteBancaire{
    private double minSolde = 200;
    private double tauxAnnuel = 0.01;
    private double soldeEpargne;

    public CompteEpargne(long numero, double solde, double minSolde, double tauxAnnuel ,double soldeEpargne){
        super(numero, solde);
        this.minSolde = minSolde;
        this.tauxAnnuel = tauxAnnuel;
        this.soldeEpargne = soldeEpargne;
    }

    public double TauxAnnuel() {
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Voulez-vous un compte epargne ? [y/n]");
        String response = myObj2.nextLine();
        if (response.equals("y") && solde < minSolde){
            System.out.println("t'as pas le droit de faire un compte epargne");
        }else if (response.equals("y") && solde > minSolde){
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Combien vouler-vous epargné ? (Le minimum 200 DH)");
            this.soldeEpargne = myObj3.nextDouble();
            System.out.println("vous avez epargner :" + soldeEpargne);
        }
        else {
              super.Afficher();

        }

        return tauxAnnuel;
    }
}
class CompteCourant extends CompteBancaire{

    public CompteCourant(long numero, double solde) {
        super(numero, solde);
    }
}