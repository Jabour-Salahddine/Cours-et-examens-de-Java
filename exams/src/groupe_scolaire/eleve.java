
package java101.groupe_scolaire;


public class eleve {
    private int code ;
    private String nom ;
    
    
    public eleve()
    {
        
    }
    
    public eleve(int code , String nom )
    {
        this.code=code;
        this.nom=nom;
    }
    
    void setCode(int code)
    {
        this.code=code ;
    }
    
    void setNom (String nom)
    {
        this.nom=nom;
    }
    
    String getNom()
    {
        return this.nom;
    }
    
    int getCode()
    {
        return this.code;
    }
    
    @Override
    public String toString()
    {
        return "[code : " +this.code + " nom :" + this.nom+" ]";
    }
}



