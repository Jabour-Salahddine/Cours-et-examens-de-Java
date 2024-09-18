package héritage;

public class Student extends Person{

	private String program;
	private int year;
	private double fee;
	
	
public Student(String name, String adresse, String program, int year, double fee)
{
	super();    // super(name,adresse); : appel de constructeur de la classe mere
	this.program = program;
   	this.year = year;
   	this.fee = fee;
   
}

       //getter for grogram:
public String GetProgram()
{
	return this.program;
   
}

          //setter for program:
public void SetProgram(String Program)
{
	this.program=program;
   
}
	

    //getter for year:
public int GetYear()
{
	return this.year;
   
}

       //setter for year:
public void SetYear(int year)
{
	this.year = year;
   
}

        //getter for fee:

public double GetFee()
{
	return this.fee;
   
}

 
        //setter for fee:
public void SetFee(double fee)
{
	this.fee = fee;
   
}


  // methde toString


public String toString()
{
	 
	 return "Person[name = "+this.GetName()+" , adresse = "+this.GetAdresse()+" ,program = "+this.program+" ,year = "+this.year+" ,fee = "+this.fee+"]";

}


//R.M: est ce que je peux creer la superclmasse dans
//un package et les sous classes (filles) dans un  autre package?----->oui

// dans le cas d'heritage si les attributs de la classe mere sont public ou protected
//meme si il sont dans diff package pas de probleme---->acces directe.

// sinon(les attributs sont private il faut passer par des getters au niveau de la calsse mere)




                 //la vesibilité d'une classe:
/*R.M: En Java, une classe déclarée comme private n'est accessible
que depuis l'intérieur de la classe où elle est définie.
Cela signifie que la classe n'est pas visible en dehors 
de la classe qui la contient. Elle ne peut pas être instanciée
ou utilisée depuis d'autres classes, même si elles sont dans le même package.*/





	
	
}
