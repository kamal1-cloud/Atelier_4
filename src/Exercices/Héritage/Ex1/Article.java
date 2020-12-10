package Exercices.Héritage.Ex1;

public class Article {
    protected String nom;
    protected double prix;

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficher(){
        System.out.println("Le prix de l\'article est"+" "+prix+" "+"$");
    }
}
     class ArticleEnSold extends Article{
         double pourcentage;

        public ArticleEnSold(String nom, double prix, double pourcentage) {
            super(nom, prix);
            this.pourcentage = pourcentage;

        }

        public void afficher(){
            super.afficher();
            System.out.println("Le prix avec la reduction"+" "+(prix*pourcentage));
            System.out.println("T'as une reduction de 40% sur le prix d'origine");
        }

         public static void main(String[] args) {
             ArticleEnSold ArticlePrice = new ArticleEnSold("Java course", 2000, 0.4);
             ArticlePrice.afficher();
         }
    }

