
package java101.testefiliere;

public class Article {
    private int prix ;
    private int code ;
    private String categorie ;
    
    public Article()
    {
        
    }
    public Article(int prix, int code ,String categorie )
    {
        try{
            this.prix=prix ;
            this.code=code ;
            this.categorie=categorie ;
                        if(!categorie.equals("mathematiques")&&!categorie.equals("informatique"))
                            throw new excptionMisMatchCategrorie("mochkil a3chiri");
            }
        catch(excptionMisMatchCategrorie e)
        {
            System.out.println("categorie invalide");
        }
                
    }
    
    public boolean Equals(Article a1 , Article a2)
    {
        int vrai=1 ;
        if(a1.code!=a2.code)
        {
            vrai=0;
        }
        if(a1.prix!=a2.prix)
        {
            vrai=0;
        }
        if(a1.categorie.equals(a2.categorie))
        {
            vrai=0;
        }
        
        return vrai==1;
    }
    
    class excptionMisMatchCategrorie extends Exception
    {
        public excptionMisMatchCategrorie(String s)
        {
            super(s);   
        }
    }
    
    public int getPrix()
    {
        return prix ;
    }
    
    public int getCode()
    {
        return code ;
    }
    
    public String getCtegorie()
    {
        return categorie ;
    }
}
