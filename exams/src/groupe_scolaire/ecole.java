
package java101.groupe_scolaire;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class ecole implements interface_eleve{

    private int id ;
    private String libelle ;
    ArrayList <eleve> liste_ecole = new ArrayList<>() ;
    
    public ecole()
    {
        
    }
    
    public ecole(int id , String libelle )
    {
        this.id=id ;
        this.libelle=libelle;
    }
    
    @Override
    public void create(eleve e) {
        liste_ecole.add(e);
    }

    @Override
    public void delete(eleve e) {
        liste_ecole.remove(e);
    }

    @Override
    public eleve findByCode(String Code) {
        
        int code = Integer.parseInt(Code);
       for (int i=0 ; i< liste_ecole.size() ; i++)
       {
           if(liste_ecole.get(i).getCode()==code)
           {
               return liste_ecole.get(i);
           }
       }
        return null ;
    }
    
    void setId(int id)
    {
        this.id=id;
    }
    
    void setLibelle(String libelle)
    {
        this.libelle=libelle ;
    }
    
    String getLibelle()
    {
        return this.libelle;
    }
    
    int getId()
    {
        return this.id;
    }
}
