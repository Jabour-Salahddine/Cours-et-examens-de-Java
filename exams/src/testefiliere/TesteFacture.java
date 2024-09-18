
package java101.testefiliere;

import java.util.Scanner;
public class TesteFacture {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        // TODO code application logic here
       /* Facture f = new Facture("adam", "january2024",4);
        Article a1= new Article(100,1,"informatique");
        Article a2= new Article(150,2,"mathematiques");
        Article a3= new Article(199,3,"informatique");
        Article a4= new Article(350,4,"mathematiques");
        f.ajouteLigne(a1, 1);
        f.ajouteLigne(a2, 3);
        f.ajouteLigne(a3, 6);
        f.ajouteLigne(a4, 2);
        
        System.out.println(f);*/
       
        System.out.print("donner votre nom ==> ");
        String nom = s.nextLine();
        System.out.print("entrer la date d'aujourdhuit ==> ");
        String date = s.nextLine();
        System.out.print("entrer le nbr de transaction a effectuer ==> ");
        int nbr = s.nextInt();
        
        Facture f1 = new Facture(nom, date,nbr);
        
        Article[]ART= new Article [nbr];
        
        for(int i=0 ; i<nbr ; i++)
        {
            s.nextLine();
            System.out.print("\npour la Transaction num "+(i+1)+"\n");
            System.out.print("entrer la categorie de l'article ==> ");
            String cat =s.nextLine();
            System.out.print("entrer le prix de l'article ==> ");
            int prix =s.nextInt();
            System.out.print("entrer le code de l'article ==> ");
            int code =s.nextInt();
            ART[i]= new Article(prix,code,cat);
        }
        
        for(int i =0 ; i<ART.length ; i++)
        {
            System.out.print("\nQuelle est la quantite du produit *"+ART[i].getCode()+"* : ");
            int qt=s.nextInt();
            f1.ajouteLigne(ART[i],qt);
        }
        
        System.out.println(f1);
       
    }
    
}
