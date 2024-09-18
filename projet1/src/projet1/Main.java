package projet1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Phone phone1 = new Phone(); //instantiation (avec un object) 

	phone1.SE = "android";
	phone1.nom = "samsung s3";
	phone1.ram = 4;
	phone1.prix = 5000; 
	
	phone1.ring();
	
	System.out.println("assbr awld llllkh");
	
	phone1.call();
	
	new Phone().call();//  anonymous object on l'utilise une fois d'une maniere transitoire...     

    System.out.println("la valeur de la ram est:"+phone1.getram());
	
	phone1.setram(8);
	
	System.out.println("la nouvelle  valeur de la ram est:"+phone1.getram());
	
	
	
	
	
	
	
	
	}

}