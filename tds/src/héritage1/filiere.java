package héritage1;

public class filiere {
private String code;
private String libelle;
private int id;
private static int cp;

filiere (String code, String libelle)
{
	
  this.id=++cp;
  this.code=code;
  this.libelle=libelle;

}

public String Getcode()
{
	 return this.code;
	 
}

     	

public String Getlibelle()
{
	 
	 return this.libelle;
 }


    
public void Setcode(String code)
{
	 
	 this.code=code;
	 
}	

public void Setlibelle(String libelle)
{
	 
	 this.libelle=libelle;
	 
}	

public int Getid()
{
	 return this.id;
	 
}

public void setid(int id)
{
   this.id=id;	

}



}



