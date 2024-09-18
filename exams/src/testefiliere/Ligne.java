
package java101.testefiliere;


public class Ligne {
             private Article article ;
             private int quantite ;

     public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }
     
     public double prixTotal()
     {
         double price = (double)this.article.getPrix()*this.quantite;
         return price ;
     }
             
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
