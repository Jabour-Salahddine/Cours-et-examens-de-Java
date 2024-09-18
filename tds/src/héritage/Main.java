package héritage;

public class Main { 

	public static void main(String[] args) {
		
		 Person persone1 = new Person("Salah","Settat");
		
		 System.out.println("person1 ---> "+persone1.toString());
		
         
		 Student student1 = new Student("Salah","Settat","info",2023,125.125); 
		 
		 System.out.println("persone1----->"+student1.toString());
		
		 
		 System.out.println("person1 ---> "+persone1);
	}

}
