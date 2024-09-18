package héritage1;

public class Etudiant {

private String nom;
private String prenom;
private int id;
private filiere fi;

Etudiant(String nom, String prenom,filiere fi)
{ 
	this.nom=nom;
	this.prenom=prenom;
    this.fi=fi;
}

public String toString()
{
	 
	 return "Etudiant[nom = "+this.nom+" , prenom = "+this.prenom+"]";

}


    //getters :
public String Getnom()
{
	 return this.nom;
	 
}

     	

public String Getprenom()
{
	 
	 return this.prenom;
 }


          //setter of nom    

public void Setnom(String nom)
{
	 
	 this.nom=nom;
	 
}	

             //setter of prenom
public void Setprenom(String prenom)
{
	 
	 this.prenom=prenom;
	 
}	

           //setter of filiere:

public void Setfilire(filiere fi)
{
	 
	 this.fi=fi;
	 
}	


         // getter of filiere 

public filiere Getfilire()
{
	 
	 return this.fi;
 }



}
