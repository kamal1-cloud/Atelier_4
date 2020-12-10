package Exercices.Constructor;

public class Employe {

    private String nom;
    private String prenom;
    private String adresse;
    private int anneeNaissance;
    private int anneeEncours;

   public int calculerAge(){
       System.out.println("Mr"+" "+prenom+" "+nom+" "+"a"+" "+(anneeEncours - anneeNaissance)+" "+"ans");
       return 0;
    }
    public void afficherInfosClient(){
        System.out.println(prenom+" "+nom+","+" "+"né le"+" "+anneeNaissance+" "+"habitant à"+" "+adresse+"\n");
    }
    public Employe(String name, String lName,String adress, int birthDay, int curretYear){
        this.nom = name;
        this.prenom = lName;
        this.adresse = adress;
        this.anneeNaissance = birthDay;
        this.anneeEncours = curretYear;
    }

}
