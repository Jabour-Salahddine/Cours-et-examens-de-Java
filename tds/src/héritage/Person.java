package héritage;

public class Person {

	//atributs
	 private String name;
     private String adresse;
       
	
     //constructeur
 public Person(String name, String adresse)
 {
	 this.name = name;
	 this.adresse = adresse; 
	 
 }
	
      //getter of name:	
 
 public String GetName()
 {
	 return this.name;
	 
 }
 
      //getter of adresse:	

 public String GetAdresse()
 {
	 
	 return this.adresse;
  }
 
 
     //setter of adresse:
 
 public void SetAdresse(String adresse)
 {
	 
	 this.adresse=adresse;
	 
 }
 
 public String toString()
 {
	 
	 return "Person[name = "+this.name+" , adresse = "+this.adresse+"]";
 
 }
 
 
public Person() {}
 
 
 
 
 
 
 
 
 
	
}
