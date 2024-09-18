package héritage;

public class Staff extends Person{

private String school;
private double pay;

public Staff(String name,String adresse, String school, double pay) 
{  
	super(name,adresse);
	this.school=school;
	this.pay=pay;
		
}


public String GetSchool() 
{

	 return this.school;
}

public void SetSchool(String school)
{
    	this.school=school;

}





public double GetPay() 
{

	 return this.pay;
}


       
public void SetPay(double pay)
{
    	this.pay=pay;

}



public String toString() 
{
   return "Person[ name = "+this.GetName()+" ,adresse = "+this.GetAdresse()+" ,school = "+this.school+" ,pay = "+this.pay+"]";	

}



	
}
