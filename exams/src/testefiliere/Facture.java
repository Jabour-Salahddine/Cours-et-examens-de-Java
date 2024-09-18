
package java101.testefiliere;


public class Facture {
    private static int numero =0 ;
    private int nblignes =0 ;
    private Ligne[] ligne ;
    private String client ;
    private String date;
    
    
    public Facture(String client ,String date , int nbLignes )
    {
        this.nblignes=nbLignes;
        this.ligne=new Ligne[nblignes];
        this.client=client ;
        this.date=date; 
    }
    
    public void ajouteLigne(Article a , int qt)
    {
        if(numero<nblignes)
        this.getLigne()[numero++]= new Ligne (a,qt);
        else
        {
            System.out.println("maximum lignes est depasser for today , try later ");
        }
    }
    
    public double getPrixTotal()
    {
        double sum =0;
        for(int i=0 ; i<nblignes ; i++)
        {
            sum+=(double)getLigne()[i].prixTotal();
        }
        return sum ; 
    }
    
    public Ligne[] getLigne()
    {
        return this.ligne;
    }

    public String getClient() {
        return client;
    }

    public String getDate() {
        return date;
    }
    
    
    public String toString()
    {
        return "le prix a deposer est "+this.getPrixTotal() + " en "+this.getDate() + " pour Mr/Mme "+this.getClient();
    }
}
