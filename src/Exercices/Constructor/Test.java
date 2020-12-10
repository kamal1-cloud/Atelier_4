package Exercices.Constructor;

public class Test {
    public static void main(String[] args) {
        Employe personne1 = new Employe("Mohammad","El alami","Casablanca",1963,2020);
        personne1.calculerAge();
        personne1.afficherInfosClient();
        Employe personne2 = new Employe("Khalid","El wahabi","Safi",1990,2020);
        personne2.calculerAge();
        personne2.afficherInfosClient();
        Employe personne3 = new Employe("Fouad","Sbai","Salé",2006 ,2020);
        personne3.calculerAge();
        personne3.afficherInfosClient();
    }
}
